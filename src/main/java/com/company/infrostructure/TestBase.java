package com.company.infrostructure;

import com.company.infrostructure.logger.FileTestLogger;
import com.company.infrostructure.logger.StdTestLogger;
import com.company.infrostructure.logger.TestLogger;
import com.company.infrostructure.wdm.DefaultWebDriverManager;

public class TestBase {

    private DefaultWebDriverManager wdm;
    protected String browser;
    protected TestLogger logger;

    public void setUp(){
        logger =getLogger();
        logger.log("Opening browser");
        wdm=new DefaultWebDriverManager();
        browser=wdm.getBrowser();
        logger.log("Open site");
        beforeTest();

    }
     public void cleanUp(){
        afterTest();
        wdm.destroyBrowser(browser);

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
