package com.company;

public class areEqualByThreeDecimalPlaces {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(-3.175, -3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b)
    {
        a*=1000;
        b*=1000;
        if((int)a == (int)b) return true;
        return false;
    }

}
