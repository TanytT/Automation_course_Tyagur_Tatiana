package com.company.infrostructure.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class TestLogger {
    private int cnt=0;
    protected String formatMessage(String msg){
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss:SSS");
        String time = sdf.format(new Date());
        String procName = Thread.currentThread().getName();
        cnt++;
        return (cnt +") " + time + " [ "+procName + " ]: " + msg);
    }
    public abstract void log(String msg);
}
