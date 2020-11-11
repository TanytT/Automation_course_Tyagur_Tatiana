package com.company.lectures.lecture09;

import com.company.infrostructure.logger.StdTestLogger;
import com.company.infrostructure.logger.TestLogger;

public class SomeTest {
    public static void main(String[] args) {
        TestLogger logger = new StdTestLogger();
        logger.log("Start browser.");
        logger.log("Open website.");
        logger.log("Click login link.");
        logger.log("Enter email.");
        logger.log("Enter password.");
        logger.log("Check user loged in.");
        logger.log("Close browser.");

    }
}
