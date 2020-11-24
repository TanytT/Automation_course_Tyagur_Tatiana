package com.company.infrostructure.wdm;

import com.company.infrostructure.config.ConfigurationManager;
import com.company.infrostructure.wdm.interfaces.WebDriverFactory;

public class CloudWebDriverFactory implements WebDriverFactory {
    @Override
    public String create() {

        switch (BrowserType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase())){
            case CHROME:
                return "Cloud Google Chrome"; //return new RemoteDriver(user:passw@url, config);
            case FIREFOX:
                return "Cloud Mozilla Firefox"; //return new RemoteDriver(user:passw@url, config);
            case EDGE:
                return "Remote Edge"; //return new RemoteDriver(url, config);
        }
        return "";
    }
}
