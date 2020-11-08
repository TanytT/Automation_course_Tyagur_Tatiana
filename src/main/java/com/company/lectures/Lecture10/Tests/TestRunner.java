package com.company.lectures.Lecture10.Tests;

public class TestRunner {

    public static void main(String[] args) {
        RozetkaFiltersTest test = new RozetkaFiltersTest();

        test.setUp();
        test.testOpenComputersItem();
        test.cleanUp();
        System.out.println("-------------------------------------");

        test.setUp();
        test.testOpenElectronicsItem();
        test.cleanUp();
        System.out.println("----------------------------------");

        test.setUp();
        test.testOpenBooks();
        test.cleanUp();
        System.out.println("----------------------------------");

        MyOrders otherTest = new MyOrders();
        otherTest.setUp();
        otherTest.testListOrder();
        otherTest.cleanUp();
        System.out.println("----------------------------------");

        otherTest.setUp();
        otherTest.testEmptyOrderList();
        otherTest.cleanUp();
        System.out.println("----------------------------------");
    }
}
