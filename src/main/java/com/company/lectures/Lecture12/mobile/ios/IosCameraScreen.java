package com.company.lectures.Lecture12.mobile.ios;

import com.company.lectures.Lecture12.mobile.interfaces.CameraScreen;

public class IosCameraScreen implements CameraScreen {
    @Override
    public void takePicture() {
        System.out.println("iOS take picture");
    }
}
