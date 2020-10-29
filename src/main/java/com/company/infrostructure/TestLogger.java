package com.company.infrostructure;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestLogger {
    private int cnt=0;
    public void log(String msg){

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss:SSS");
        String time = sdf.format(new Date());
        String procName = Thread.currentThread().getName();
        System.out.println(++cnt + ") " + time + " [ "+procName + " ]: " + msg);
    }
}
