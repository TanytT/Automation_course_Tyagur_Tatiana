package com.company.infrostructure.base;

import com.company.infrostructure.WebDriverManager;
import com.company.infrostructure.config.ConfigurationManager;
import com.company.infrostructure.logger.FileTestLogger;
import com.company.infrostructure.logger.StdTestLogger;
import com.company.infrostructure.logger.TestLogger;

public class TestBase {

    private WebDriverManager wdm;
    protected String browser;
    protected TestLogger logger;

    public void setUp(){
        logger =getLogger();
        logger.log("Opening browser");
        wdm=new WebDriverManager();
        browser=wdm.createBrowser();
        logger.log("Open site");
        beforeTest();

    }
     public void cleanUp(){
        afterTest();
        wdm.closeBrowser(browser);

     }

     public void beforeTest(){

     }
     public void afterTest(){

     }
     private TestLogger getLogger(){
        return ConfigurationManager.getInstance().getTestLogger().equals("std") ?
                new StdTestLogger() :
                new FileTestLogger("report_"+System.currentTimeMillis()+".txt");
     }
}
