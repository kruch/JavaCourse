package com.company;



public class GreatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));

    }

    public static int getGreatestCommonDivisor(int first, int second)
    {
        if(first < 10 || second < 10) return -1;

        int commonDivisor =2, smaller;

        if(first<second) smaller = first;
        else smaller = second;

        for(int i = 1 ; i < smaller ; i++ )
        {

            if(first % i == 0 && second % i == 0) commonDivisor = i;
        }
        return commonDivisor;
    }

 }

