package org.example.allaboutTestNGBasics;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ok {

    @BeforeMethod
    @org.testng.annotations.Test
    public void firstTestCase()
    {
        System.out.println("Pre-requisites");
    }


    @Test
    public void FirstTestCase()
    {
        System.out.println("Hello 1 st test case");
    }

    @AfterMethod
    @org.testng.annotations.Test
    public void SecondTestCase()
    {
        System.out.println("Post-requisites");
    }
}
