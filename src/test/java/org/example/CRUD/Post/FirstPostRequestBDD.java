package org.example.CRUD.Post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class FirstPostRequestBDD {

    //URL https://restful-booker.herokuapp.com/booking/1471
    //Method - Post
    //Payload
    //Header
    String payload = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";
@Test
    public void FirstPost()
    {
        RestAssured.given().relaxedHTTPSValidation().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth").contentType(ContentType.JSON).log().all()
                .body(payload)
                .when().post()
                .then().log().all().statusCode(200);
    }
}
//.... dot - dot means its BDD Builder Design Pattern