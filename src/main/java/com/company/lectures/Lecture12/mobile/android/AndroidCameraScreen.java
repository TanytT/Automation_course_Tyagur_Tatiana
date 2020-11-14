package com.company.lectures.Lecture12.mobile.android;

import com.company.lectures.Lecture12.mobile.interfaces.CameraScreen;

public class AndroidCameraScreen implements CameraScreen {
    @Override
    public void takePicture() {
        System.out.println("-->Android take picture");
    }
}
