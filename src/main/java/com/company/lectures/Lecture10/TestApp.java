package com.company.lectures.Lecture10;

import com.company.infrostructure.TestLogger;
import com.company.infrostructure.TestServer;
import com.company.infrostructure.WebDriverManager;

public class TestApp {
    public static void main(String[] args) {
        TestLogger logger = new TestLogger();
        WebDriverManager wdm = new WebDriverManager();

        logger.log("Opening browser: ");
        String browser = wdm.createBrowser();
        System.out.println("Opened browser "+browser);

        logger.log("Opening site ");
        String site = TestServer.getURL();
        System.out.println("Opened site: "+site);

        logger.log("Step 1: ");
        logger.log("Step 2: ");
        logger.log("Step 3: ");
        logger.log("Step 4: ");
        logger.log("Step 5: ");
        logger.log("Step 6: ");
        logger.log("Check ");

        logger.log("Closing browser");
        wdm.closeBrowser(browser);



    }
}
