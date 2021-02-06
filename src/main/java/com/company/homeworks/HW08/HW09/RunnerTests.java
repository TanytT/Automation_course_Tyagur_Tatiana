package com.company.homeworks.HW08.HW09;

public class RunnerTests {
    public static void main(String[] args) {
        PersonalCabinet perCab = new PersonalCabinet();

        perCab.setUp();
        perCab.myTickets();
        perCab.cleanUp();
        System.out.println("----------------------------------------");

        perCab.setUp();
        perCab.chosenMovies();
        perCab.cleanUp();
        System.out.println("----------------------------------------");

        perCab.setUp();
        //perCab.bonuses();
        perCab.cleanUp();
        System.out.println("----------------------------------------");

        PersonalData persData = new PersonalData();
        persData.setUp();
        persData.changePassword();
        persData.cleanUp();
        System.out.println("----------------------------------------");

        persData.setUp();
        persData.changeEmail();
        persData.cleanUp();
        System.out.println("----------------------------------------");

        Filters filt = new Filters();
        filt.setUp();
        filt.choosePeriod();
        filt.cleanUp();
        System.out.println("----------------------------------------");

        filt.setUp();
        filt.chooseTechnology();
        filt.cleanUp();
        System.out.println("----------------------------------------");

        filt.setUp();
        filt.chooseFormat();
        filt.cleanUp();
        System.out.println("----------------------------------------");

        Seance seance = new Seance();
        seance.setUp();
        seance.openMoviePage();
        seance.cleanUp();
        System.out.println("----------------------------------------");

        seance.setUp();
        seance.choosePlace();
        seance.cleanUp();


    }
}
