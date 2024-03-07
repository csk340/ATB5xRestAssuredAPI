package org.example.CRUD.Put;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class NonBDDPut {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    //String token = "72e8b8d1e4bb5b7";
    /*
    - Base URL (URi +Base Path)
    - Header
    - Payload
    - authentication
    - put
    - status code/
    - payload verify

     */
    //Payload which we want to update to that id
    //id : 2847
    //token : "b9db4068d8cd0eb"
    String payload ="{\n" +
            "        \"firstname\": \"Csk\",\n" +
            "        \"lastname\": \"Swift\",\n" +
            "        \"totalprice\": 34221,\n" +
            "        \"depositpaid\": true,\n" +
            "        \"bookingdates\": {\n" +
            "            \"checkin\": \"2023-06-26\",\n" +
            "            \"checkout\": \"2024-06-26\"\n" +
            "        },\n" +
            "        \"additionalneeds\": \" free wifi \"";

    @Test
    public void PutExtraction()
    {
        r = RestAssured.given().log().all().header("Content-Type", "application/json");
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/958");
        //r.auth().basic("admin", "password123").body(payload);  //Using cookie auth here
        r.contentType("application/json");
        r.contentType(ContentType.JSON);
        //r.cookies("token", token);//Instead of base auth here we are using cookie auth
        r.body(payload);


        response = r.when().put();

        vr= response.then().log().all();
        //vr.statusCode(200);
        vr.body("firstname", Matchers.equalTo("Csk"));
        vr.body("lastname", Matchers.equalTo("Swift"));
        //Take a bit care for data types of value in payload
        vr.body("totalprice", Matchers.equalTo(34221));
        vr.body("depositpaid", Matchers.equalTo(true));
        vr.body("additionalneeds", Matchers.equalTo("free wifi"));
        vr.body("checkin", Matchers.equalTo("2023-06-26"));
        vr.body("checkout", Matchers.equalTo("2024-06-26"));
        //Question: How to validate response under another object (e.g. here check in and checkout dates)

    }
}
