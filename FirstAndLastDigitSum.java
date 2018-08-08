package com.company;



public class FirstAndLastDigitSum {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(201));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }
    public static int sumFirstAndLastDigit(int number)
    {
        if(number<0) return -1;
        int sum = 0;
        int lastDigit = 0, firstDigit = 0;
        lastDigit = number%10;

        while(number != 0)
        {
            firstDigit = number%10;
            number/=10;
        }

        sum = firstDigit + lastDigit;
        return sum;
    }
 }

