package com.company.lectures.Lecture12.devices;

import com.company.lectures.Lecture12.tech.Bluetooth;
import com.company.lectures.Lecture12.tech.Cellular;
import com.company.lectures.Lecture12.tech.WiFi;

public class Smartphone implements Bluetooth, WiFi, Cellular {
    @Override
    public void connect() {
        System.out.println("iPhone connected");
    }

    @Override
    public void transfer() {
        System.out.println("iPhone transfer");

    }

    @Override
    public void triangular() {
        System.out.println("iPhone triangle");

    }

    @Override
    public void broadcast() {
        System.out.println("iPhone broadcast");
    }

    @Override
    public void receive() {
        System.out.println("iPhone receive");
    }
}
