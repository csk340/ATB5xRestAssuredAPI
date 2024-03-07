package org.example;

import io.restassured.RestAssured;

public class FirstRATestCase {
    public static void main(String[] args) {
        RestAssured
                .given().baseUri("https://api.zippopotam.us").basePath("IN/560037")
                .when().get()
                .then().statusCode(200);
    }
    //After running the program if there is no error in output that means program run successfully and test case is pass
    //If there is any error in program then in output error will be shown
    //RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/IN/560037").when().get().then.statusCode(200);
    //Here you were making mistake to writing all this Gerkin syntax outside of the main method



    /*

    Given ()
    URL:- https://api.zippopotam.us/IN/560037
    Base URL :- https://api.zippopotam.us
    Base Path:- /IN/560037
    Payload/ Authentication - If necessary
    Header

    When()
    Http method - Get method
    Payload:- If necessary
     */

}
