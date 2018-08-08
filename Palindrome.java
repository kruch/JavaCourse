package com.company;



public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(1001));
        System.out.println(isPalindrome(-1001));
        System.out.println(isPalindrome(11221));

    }
    public static boolean isPalindrome(int number)
    {
        int palindrome = number;
        int reverse = 0, lastDigit = 0;

        while(palindrome!=0)
        {
            lastDigit = palindrome % 10;
            reverse = (reverse * 10) + lastDigit;
            palindrome/=10;
        }
        if(reverse == number) return true;
        return false;
    }
 }

