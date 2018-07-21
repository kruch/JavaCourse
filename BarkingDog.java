package com.company;

public class BarkingDog {

    public static void main(String[] args) {

        boolean pointer;

        pointer = bark(true, 1);//true
        System.out.println(pointer);
        pointer =bark(false,2);//false
        System.out.println(pointer);
        pointer =bark(true,8);//false
        System.out.println(pointer);
        pointer =bark(true, -1);//false
        System.out.println(pointer);
    }
    public static boolean bark ( boolean barking, int hourOfDay)
    {
        if(barking)
        {
            if(hourOfDay>22 && hourOfDay<=23 || hourOfDay >= 0 && hourOfDay <8)
            {
                return true;
            }
        }
        return false;
    }
}
