package com.company.lectures.Lecture10.Tests;

import com.company.infrostructure.TestBase;

public class MyOrders extends ClientTestBase {

    @Override
    public void afterTest() {
        //if orders !empty ---> delete
        logger.log("Delete orders.");
    }

    public void testListOrder(){
        logger.log("Add orders to page");
        logger.log("Open personal page");
        logger.log("Click on my order link");
        logger.log("Check list of orders");

    }
    public void testEmptyOrderList(){
        logger.log("Open personal page");
        logger.log("Click on my order link");
        logger.log("Check if empty list of orders");

    }

}
