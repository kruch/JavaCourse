package com.company;

import java.sql.Time;

public class AreaCalculator {
    public static void main(String[] args) {

        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }
    public static double area(double radius)
    {
        if(radius<0)
        {
            return -1.0;
        }
        double PI = 3.14159;
        double area = PI * radius * radius;

        return area;
    }
    public static double area(double a, double b)
    {
        if(a < 0 || b < 0)
        {
            return -1;
        }
        double area=a*b;

        return area;
    }

}
