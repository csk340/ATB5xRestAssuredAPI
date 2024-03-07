package org.example.CRUD.Post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
//Everything is ready:- It's like pizza base is ready just add topins and enjoy it
public class PostNonBDDAuthWithExtraction {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    /*
    Data:-
    URL : https://restful-booker.herokuapp.com/auth
    Given:-
    Base Uri: https://restful-booker.herokuapp.com
    Base Path:  /auth
    Paylod : {
    "username" : "admin",
    "password" : "password123"
}
     Header > Content Type : application/json

     When
     Method :- Post

     Then
     status code, header, time
     */
    String Paylod = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";
    @Test
    public void ExtractAllThree()
    {
        //Given
         r = RestAssured.given();  //Extracted given
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.body(Paylod);
        r.contentType(ContentType.JSON);

        //When
         response = r.when().post(); //Extracted when from request specification in line 37

        //Then
        vr = response.then().log().all(); //Extracted then from response in line 44
        String responseString = response.asString(); //Why this line needed ?

        //System.out.println(responseString);
        vr.statusCode(200);
        //vr.contentType(ContentType.JSON);
       // vr.time



    }
}
