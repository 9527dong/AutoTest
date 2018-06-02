package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("Test这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("Test这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在每一个测试方法之前运行的，测试方法有几个，运行几次");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在每一个测试方法之后运行的，测试方法有几个，运行几次");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在类运行之前运行的方法，一个测试类中运行一次");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在类运行之后运行的方法，一个测试类中运行一次");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }
}
