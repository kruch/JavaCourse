package com.company;



public class sharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15,55));
    }
    public static boolean hasSharedDigit(int first, int second)
    {
        if((first < 10 || first > 99) || (second < 10 || second > 99)) return false;

        int firstLast = 0, secondLast = 0, secondSecond = 0, secondFirst;


            firstLast = first % 10;
            first /= 10;
            secondLast = second % 10;
            second /= 10;
            secondFirst = first % 10;
            secondSecond = second % 10;

            if(firstLast == secondLast || secondFirst == secondSecond || firstLast == secondSecond) return true;

        return false;
    }
 }

