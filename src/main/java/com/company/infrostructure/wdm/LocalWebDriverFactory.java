package com.company.infrostructure.wdm;

import com.company.infrostructure.config.ConfigurationManager;
import com.company.infrostructure.wdm.interfaces.WebDriverFactory;

public class LocalWebDriverFactory implements WebDriverFactory {
    @Override
    public String create() {
        switch (ConfigurationManager.getInstance().getTestBrowser()){
            case "chrome":
                return "Local Google Chrome"; //return new ChromeDriver();
            case "firefox":
                return "Local Mozilla Firefox"; //return new ChromeDriver();
        }
        return "";
    }
}
