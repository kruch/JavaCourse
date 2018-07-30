package com.company;

import java.sql.Time;

public class SecondsAndMinutes {
    public static void main(String[] args) {

        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds)
    {
        String Time;
        if(minutes < 0 || seconds<0 || seconds >59)
        {
            return "Invalid value";
        }
        int hours = 0;

            hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            Time = hours+"h "+remainingMinutes+" m "+seconds+"s ";
            return Time;
    }
    public static String getDurationString(int seconds)
    {
        if(seconds<=0)
        {
            return "Invalid Value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
