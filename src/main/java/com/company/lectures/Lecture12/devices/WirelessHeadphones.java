package com.company.lectures.Lecture12.devices;

import com.company.lectures.Lecture12.tech.Bluetooth;

public class WirelessHeadphones implements Bluetooth {


    @Override
    public void connect() {
        System.out.println("Headphones connecting");
        System.out.println("Headphones connected");
    }

    @Override
    public void transfer() {
        System.out.println("Headphones send commands");
    }

    @Override
    public void receive() {
        System.out.println("Headphones play sounds");

    }
}
