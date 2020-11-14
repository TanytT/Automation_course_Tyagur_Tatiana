package com.company.lectures.Lecture12.mobile.android;

import com.company.lectures.Lecture12.mobile.interfaces.*;

public class AndroidApp implements MobileApp {
    @Override
    public MainScreen mainScreen() {
        return new AndroidMainScreen();
    }

    @Override
    public NoteScreen noteScreen() {
        return new AndroidNoteScreen();
    }

    @Override
    public CameraScreen cameraScreen() {
        return new AndroidCameraScreen();
    }

    @Override
    public Panel panel() {
        return new AndroidPanel();
    }
}
