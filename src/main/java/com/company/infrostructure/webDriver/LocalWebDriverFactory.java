package com.company.infrostructure.webDriver;

import com.company.infrostructure.ConfigurationManager;
import com.company.infrostructure.webDriver.interfaces.WebDriverFactory;

public class LocalWebDriverFactory implements WebDriverFactory {
    @Override
    public String create() {
        return ConfigurationManager.getInstance().getTestBrowser();
    }
}
