package com.company.infrostructure.wdm;

import com.company.infrostructure.config.ConfigurationManager;
import com.company.infrostructure.wdm.interfaces.WebDriverFactory;

public class CloudWebDriverFactory implements WebDriverFactory {
    @Override
    public String create() {

        switch (ConfigurationManager.getInstance().getTestBrowser()){
            case "chrome":
                return "Cloud Google Chrome"; //return new RemoteDriver(user:passw@url, config);
            case "firefox":
                return "Cloud Mozilla Firefox"; //return new RemoteDriver(user:passw@url, config);
        }
        return "";
    }
}
