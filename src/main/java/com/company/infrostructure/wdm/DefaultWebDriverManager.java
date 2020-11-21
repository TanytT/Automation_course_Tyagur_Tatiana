package com.company.infrostructure.wdm;

import com.company.infrostructure.ConfigurationManager;
import com.company.infrostructure.wdm.interfaces.WebDriverFactory;
import com.company.infrostructure.wdm.interfaces.WebDriverManager;

public class DefaultWebDriverManager implements WebDriverManager {
    @Override
    public String getBrowser() {
        WebDriverFactory factory;
        switch (ConfigurationManager.getInstance().getRunOn()){
            case "local":
                factory=new LocalWebDriverFactory();
                break;
            case"remote":
                factory = new RemoteWebDriverFactory();
                break;
            case "cloud":
                factory = new CloudWebDriverFactory();
                break;
            default:
                return "";
        }

        return factory.create();
    }

    @Override
    public void destroyBrowser(String browser) {
        if(browser !=null){
            //browser.quit();
            System.out.println("Closing browser:" + browser);
        }

    }
}
