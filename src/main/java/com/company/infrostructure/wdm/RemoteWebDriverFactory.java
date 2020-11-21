package com.company.infrostructure.wdm;

import com.company.infrostructure.config.ConfigurationManager;
import com.company.infrostructure.wdm.interfaces.WebDriverFactory;

public class RemoteWebDriverFactory implements WebDriverFactory {
    @Override
    public String create() {
        switch (ConfigurationManager.getInstance().getTestBrowser()){
            case "chrome":
                return "Remote Google Chrome"; //return new RemoteDriver(url, config);
            case "firefox":
                return "Remote Mozilla Firefox"; //return new RemoteDriver(url, config);
        }
        return "";
    }
}
