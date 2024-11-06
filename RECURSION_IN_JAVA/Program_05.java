package RECURSION_IN_JAVA;

import java.util.Scanner;
import java.util.*;
public class Program_05 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int x = sc.nextInt();
         int y = sc.nextInt();



        System.out.println("GCD OF THE NUMBER IS :: "+findGCD(x,y));
        System.out.println("GCD OF THE NUMBER IS :: "+findGCD2(x,y));
        System.out.println("LCM OF THE NUMBER IS :: "+findLCM(x,y));


    }
    public static int findGCD(int x , int y){
        while (x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        } 
        return y;
    }

    // Euclid's Algorithm
    public static int findGCD2(int x , int y){
        if(y == 0){
            return x;
        }

        return findGCD2(y , x % y);
    }

    public static int findLCM(int x , int y){
        if(y == 0){
            return x;
        }
        return (x *y) / findGCD2(y , x%y);
    }
}
