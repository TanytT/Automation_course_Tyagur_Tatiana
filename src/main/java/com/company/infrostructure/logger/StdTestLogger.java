package com.company.infrostructure.logger;

public class StdTestLogger extends TestLogger{

    @Override
    public void log(String msg) {
        System.out.println(formatMessage(msg));
    }
}
