package com.company;



public class LastDigitChecker {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

    }

    public static boolean hasSameLastDigit(int first, int second, int third)
    {
        if(first < 10 || first > 1000 || second < 10 || second > 1000 || third < 10 || third > 1000) return false;

        int firstLast = first%10, secondLast = second%10, thirdLast = third % 10;
        if(firstLast == secondLast || firstLast == thirdLast || secondLast == thirdLast) return true;
        return false;

    }

 }

