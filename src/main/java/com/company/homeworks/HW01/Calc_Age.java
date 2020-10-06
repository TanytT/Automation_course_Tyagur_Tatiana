package com.company.homeworks.HW01;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class Calc_Age {
    public static void main(String[] args) {
        int my_day, my_mon,my_year;
        Scanner in = new Scanner(System.in);
        System.out.print("Input your date of birthday:");
        System.out.println("Day: ");
        my_day = in.nextInt();
        System.out.println("Number of month: ");
        my_mon = in.nextInt();
        System.out.println("Year: ");
        my_year = in.nextInt();

        LocalDateTime my = LocalDateTime.of(my_year,my_mon,my_day,0,0);
        LocalDateTime now = LocalDateTime.now();
        long sec = ChronoUnit.SECONDS.between(my, now);
        System.out.println("Your age in seconds: "+ sec);
        long min = ChronoUnit.MINUTES.between(my, now);
        System.out.println("Your age in minutes: "+ min);
        long hour = ChronoUnit.HOURS.between(my, now);
        System.out.println("Your age in hours: "+ hour);
        long days = ChronoUnit.DAYS.between(my, now);
        System.out.println("Your age in days: "+ days);
        long week = ChronoUnit.WEEKS.between(my, now);
        System.out.println("Your age in weeks: "+ week);
        long month = ChronoUnit.MONTHS.between(my, now);
        System.out.println("Your age in months: "+ month);
        long year = ChronoUnit.YEARS.between(my, now);
        System.out.println("Your age in years: "+ year);

    }
}
