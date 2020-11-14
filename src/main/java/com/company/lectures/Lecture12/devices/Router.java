package com.company.lectures.Lecture12.devices;

import com.company.lectures.Lecture12.tech.WiFi;

public class Router implements WiFi {


    @Override
    public void connect() {
        System.out.println("Router connected");
    }

    @Override
    public void transfer() {
        System.out.println("Router transfer data");

    }

    @Override
    public void broadcast() {
        System.out.println("Router broadcast signals");
    }
}
