package com.company.lectures.Lecture12.mobile;

import com.company.infrostructure.config.ConfigurationManager;
import com.company.lectures.Lecture12.mobile.android.AndroidApp;
import com.company.lectures.Lecture12.mobile.interfaces.MobileApp;
import com.company.lectures.Lecture12.mobile.ios.IosApp;

public class MobileTests {
    public static void main(String[] args) {
        testManualNoteEntry();
        System.out.println();
        testTextRecognitionNoteEntry();

    }
    public static void testManualNoteEntry(){

        System.out.println("Open App");

        MobileApp app = getApp();
        System.out.println("Click new button");
        app.mainScreen().clickNewNoteButton();

        System.out.println("Enter some text on a on-screen keyboard");
        app.noteScreen().enterText("This is a new note");

        System.out.println("Click on The Back button");
        app.panel().clickBack();

        System.out.println("Check new note is present in the note list");
        app.mainScreen().getNoteWithTitle();

        System.out.println("Delete new note");
        app.mainScreen().deleteNote("New");
        System.out.println("Check new note is deleted/not present in the notes list");
        app.mainScreen().getNoteWithTitle();
    }

    public static void testTextRecognitionNoteEntry(){
        System.out.println("Open App");

        MobileApp app = getApp();

        System.out.println("Click new button");
        app.mainScreen().clickNewNoteButton();

        System.out.println("Click on the Camera button");
        app.noteScreen().clickCameraButton();

        System.out.println("Click button to make picture");
        app.cameraScreen().takePicture();

        System.out.println("Click on The Back button");
        app.panel().clickBack();

        System.out.println("Check the new note has recognized text ");
        app.noteScreen().getText();

        System.out.println("Click on The Back button");
        app.panel().clickBack();

        System.out.println("Check new note is present in the note list");
        app.mainScreen().clickNewNoteButton();

        System.out.println("Delete new note");
        app.mainScreen().deleteNote("Pic");

        System.out.println("Check new note is deleted/not present in the notes list");
        app.mainScreen().getNoteWithTitle();
    }

    public static MobileApp getApp(){
        return ConfigurationManager.getInstance().getMobilePlatform().equals("ios") ?
                new IosApp() : new AndroidApp();
    }
}
