package com.company;

import java.util.Scanner;

public class WaterMelon {
    static String Wm(){
        System.out.println("enter weight of Watermelon");
    Scanner sc = new Scanner(System.in);
    int n = (sc.nextInt());
    if (n < 1 || n > 100) //range for weight of watermelon
        return ("out of range");
        if (n % 2 == 0 && n != 2) // even numbers will work except 2
        {
        return ("YES");
    }
        else {
        return ("NO");
    }
    }
}

