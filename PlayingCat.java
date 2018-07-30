package com.company;

import java.sql.Time;

public class PlayingCat {
    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

    }

    public static boolean isCatPlaying(boolean summer,int temperature)
    {
        if(!summer && 24 < temperature && temperature < 36) return true;
        else if(summer && 24 < temperature && temperature < 46) return true;
        else return false;
    }
}
