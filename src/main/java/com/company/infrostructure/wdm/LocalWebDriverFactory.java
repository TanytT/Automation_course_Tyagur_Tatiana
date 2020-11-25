package com.company.infrostructure.wdm;

import com.company.infrostructure.config.ConfigurationManager;
import com.company.infrostructure.wdm.interfaces.WebDriverFactory;

public class LocalWebDriverFactory implements WebDriverFactory {
    @Override
    public String create() {
        switch (BrowserType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase())){
            case CHROME:
                return "Local Google Chrome"; //return new ChromeDriver();
            case FIREFOX:
                return "Local Mozilla Firefox"; //return new ChromeDriver();
            case EDGE:
                return "Local Edge"; //return new ChromeDriver();
        }
        return "";
    }
}
