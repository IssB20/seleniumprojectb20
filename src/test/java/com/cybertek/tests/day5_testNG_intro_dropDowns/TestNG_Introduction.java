package com.cybertek.tests.day5_testNG_intro_dropDowns;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Introduction {

    @BeforeClass
    public void setUp(){
        System.out.println("Before class Is running..");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("Before Method is running...");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running...");
    }

    @Test
    public void test1(){
        System.out.println("Test1 is running...");
    }

    @Test
    public void test2(){
        System.out.println("Test2 is running...");
    }

    @Test
    public void test3(){
        String str1 ="TestNG";
        String str2 ="TestNG";
        String str3 ="Test";

        Assert.assertTrue(str1.equals(str2)); // true
        Assert.assertTrue(str1.equals(str3), "str1 is not equal to str3."); // false

        Assert.assertEquals(str1,str2,str3 );


    }

}
