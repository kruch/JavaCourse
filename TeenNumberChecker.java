package com.company;

public class TeenNumberChecker {
    public static void main(String[] args) {
    }

    public static boolean hasTeen(int a, int b, int c)
    {
        if(a<=19 && a>=13 || b<=19 && b>=13 || c<=19 && c>=13) return true;
        return false;
    }

}
