package com.company;
import java.util.*;

public class Young_Physicist {



    static String result(){
        int n,x,y,z;
        int total_x=0,total_y=0,total_z=0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if (n<1 || n>100)
            return ("out of range");
        System.out.println("enter the variables x y and z in order");
        for (int i=0;i<n;i++){ x=scan.nextInt();
            y=scan.nextInt();
            z=scan.nextInt();
            if(x < -100 || y < -100 || z < -100 || x > 100 || y > 100 || z > 100)
                return ("out of range");
            else { total_x += x;
                total_y += y;
                total_z += z;
            }
        }
        if (total_x==0 && total_y==0 && total_z==0)
            return ("YES");
        else return("NO");
    }

}