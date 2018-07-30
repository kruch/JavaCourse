package com.company;

import java.sql.Time;

public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);


    }
    public static void printYearsAndDays(long minutes)
    {
        if(minutes < 0)
        {
            System.out.println("Invalid Value");
            return;
        }
        long hours = 0, days = 0, years = 0;
        if(minutes < 0)
        {
            System.out.println("Invalid Value");
        }
        if(minutes > 59)
        {
            hours = minutes / 60;
            long remainingMinutes = minutes % 60;
            if(hours>24)
            {
                days = hours / 24;
            }
            if(days > 364)
            {
                years = days / 365;
                days = days % 365;

            }
        }
        System.out.println(minutes + " min = " + years +" y" + " and " + days + " d" );
    }

}
