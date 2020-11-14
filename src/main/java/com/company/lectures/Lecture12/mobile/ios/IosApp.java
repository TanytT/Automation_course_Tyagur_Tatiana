package com.company.lectures.Lecture12.mobile.ios;

import com.company.lectures.Lecture12.mobile.interfaces.*;

public class IosApp implements MobileApp {
    @Override
    public MainScreen mainScreen() {
        return new IosMainScreen();
    }

    @Override
    public NoteScreen noteScreen() {
        return new IosNoteScreen();
    }

    @Override
    public CameraScreen cameraScreen() {
        return new IosCameraScreen();
    }

    @Override
    public Panel panel() {
        return new IosPanel();
    }
}
