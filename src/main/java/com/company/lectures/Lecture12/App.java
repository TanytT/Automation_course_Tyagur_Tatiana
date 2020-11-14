package com.company.lectures.Lecture12;

import com.company.lectures.Lecture12.devices.CellularPhone;
import com.company.lectures.Lecture12.devices.Router;
import com.company.lectures.Lecture12.devices.Smartphone;
import com.company.lectures.Lecture12.devices.WirelessHeadphones;
import com.company.lectures.Lecture12.tech.Bluetooth;
import com.company.lectures.Lecture12.tech.Cellular;
import com.company.lectures.Lecture12.tech.WiFi;

public class App {

    public static void main(String[] args) {
        Bluetooth airpods = new WirelessHeadphones();

        airpods.connect();
        airpods.transfer();
        airpods.receive();
        System.out.println();

        WiFi router = new Router();
        router.broadcast();
        router.connect();
        router.transfer();
        System.out.println();

        Cellular nokia1100 = new CellularPhone();
        nokia1100.connect();
        nokia1100.transfer();
        nokia1100.triangular();

        Smartphone iPhone = new Smartphone();
        iPhone.connect();
        iPhone.transfer();
        iPhone.broadcast();
        iPhone.receive();
        iPhone.triangular();

    }
}
