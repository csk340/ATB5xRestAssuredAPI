package org.example.allaboutTestNG;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class basic {

    @Test (enabled = true)
    public void testNGMethod()
    {
        System.out.println("I am from TestNG test case 1 please run me");

    }

    @Test(enabled = true)
    public void testNGMethod2()
    {
        System.out.println("I am from TestNG test case 2 please run me");

    }

    @Test
    public void testNGMethod3()

    {
        System.out.println("I am from TestNG test case 3 please run me");
    }
    @Test
    public void testNGMethod4()

    {

        System.out.println("I am from TestNG test case 4 please run me");
    }

    @Test
    public void testNGMethod5()

    {

        System.out.println("I am from TestNG test case 5 please run me");
    }

}
