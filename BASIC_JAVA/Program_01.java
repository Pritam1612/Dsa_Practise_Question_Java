package BASIC_JAVA;

import java.util.Scanner;

public class Program_01 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to basic java programming");
        System.out.println("System.out.println() help to print something in java \nln help to print next statement in next line");
        System.out.println(4+3);
        System.out.println("4+3");
        System.out.println(39 % 7);
        System.out.println(4%2);
        System.out.println(7%39);
        System.out.println(5%6);

        System.out.println("Post And Pre Increment ");
        int p =5 , q =5;
        System.out.println("Post Increment");
        System.out.println(p++);
        System.out.println(p++);
        System.out.println(p);

        System.out.println(q++);
        System.out.println(q);

        System.out.println("Pre Increment");
        int x =8 , y =8;
        System.out.println(x);
        System.out.println(--x);
        System.out.println(y);
        System.out.println(++y);
        System.out.println(y);
        System.out.println(++y);

        System.out.println("BITWISE OPERATORS");
        System.out.println(9|10);
        System.out.println(9&10);
        System.out.println(9^10);
        System.out.println("LEFT AND RIGHT SHIFT");
        System.out.println("RIGHT SHIFT");
        System.out.println(9>>1);
        System.out.println(9>>2);
        System.out.println("LEFT SHIFT");
        System.out.println(9<<1);
        System.out.println(9<<2);
        System.out.println("BIT COMPLIMENT");
        System.out.println(~10);
        System.out.println(~(-9));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
         
    }
}
