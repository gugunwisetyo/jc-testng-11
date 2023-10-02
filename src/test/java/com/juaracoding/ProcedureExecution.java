package com.juaracoding;

import org.testng.annotations.*;

public class ProcedureExecution {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    public void testOne(){
        System.out.println("Test Case One");
    }

    @Test
    public void testTwo(){
        System.out.println("Test Case Two");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

}
