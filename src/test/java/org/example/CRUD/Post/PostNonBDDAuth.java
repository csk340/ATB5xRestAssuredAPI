package org.example.CRUD.Post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PostNonBDDAuth {

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
    String Payload = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";
    RequestSpecification r = RestAssured.given().relaxedHTTPSValidation();
    @Test
     public void CreateToken()
     {
         r.baseUri("https://restful-booker.herokuapp.com").basePath("/auth").body(Payload).contentType(ContentType.JSON)
                 .when().post()
                 .then().statusCode(200);
     }
}
