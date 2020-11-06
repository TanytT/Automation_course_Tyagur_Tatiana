package com.company.infrostructure;

public class TestBase {

    private WebDriverManager wdm;
    protected String browser;
    protected TestLogger logger;

    public void setUp(){
        logger = new TestLogger();
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
}
