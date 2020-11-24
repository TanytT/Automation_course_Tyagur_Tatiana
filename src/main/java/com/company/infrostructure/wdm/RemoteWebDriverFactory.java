package com.company.infrostructure.wdm;

import com.company.infrostructure.config.ConfigurationManager;
import com.company.infrostructure.wdm.interfaces.WebDriverFactory;

public class RemoteWebDriverFactory implements WebDriverFactory {
    @Override
    public String create() {
        switch (BrowserType.valueOf(ConfigurationManager.getInstance().getTestBrowser())){
            case CHROME:
                return "Remote Google Chrome"; //return new RemoteDriver(url, config);
            case FIREFOX:
                return "Remote Mozilla Firefox"; //return new RemoteDriver(url, config);
            case EDGE:
                return "Remote Edge"; //return new RemoteDriver(url, config);
        }
        return "";
    }
}
