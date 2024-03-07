package org.example.CRUD.Get;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GetNonBDDTestNG {
    @Test
    public void negativetestcase1()
    {
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/438");
        r.when().get();
        r.then().statusCode(200);
    }

    @Test
    public void negativetestcase2()
    {
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/3984");
        r.when().get();
        r.then().statusCode(200);
    }
   // relaxedHTTPSValidation();
    @Test
    public void positivetestcase()
    {
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/438");
        r.when().get();
        r.then().statusCode(200);
    }
}
