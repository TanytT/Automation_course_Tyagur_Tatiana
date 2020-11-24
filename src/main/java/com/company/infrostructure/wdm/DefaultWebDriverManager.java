package com.company.infrostructure.wdm;

import com.company.infrostructure.config.ConfigurationManager;
import com.company.infrostructure.wdm.interfaces.WebDriverFactory;
import com.company.infrostructure.wdm.interfaces.WebDriverManager;

public class DefaultWebDriverManager implements WebDriverManager {
    @Override
    public String getBrowser() {
        WebDriverFactory factory;
        switch (RunOn.valueOf(ConfigurationManager.getInstance().getRunOn())){
            case LOCAL:
                factory=new LocalWebDriverFactory();
                break;
            case REMOTE:
                factory = new RemoteWebDriverFactory();
                break;
            case CLOUD:
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
