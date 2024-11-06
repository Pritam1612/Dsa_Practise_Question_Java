package RECURSION_IN_JAVA;

import java.util.Scanner;

public class Program_02 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER :: ");
        int number = sc.nextInt();
        System.out.println("FACTORIAL OF "+number+"! IS :: "+printFactorial(number));
        System.out.println("SUM OF "+number+" IS :: "+printSum(number));
        System.out.println("FIBONACCI SERIES IS :: "+printFibonacciSeries(number));
        for (int i = 0; i <=number; i++) {
            System.out.print(printFibonacciSeries(i)+" ");
        }
    }
    static int printFactorial(int number){
         if(number == 1){
             return 1;
         }
         int smallAnswer = printFactorial(number -1 );
         return  number * smallAnswer;
    }
    static int printSum(int number){
        if(number == 0){
            return 0;
        }
        return printSum(number-1)+number;
    }
    static int printFibonacciSeries(int number){
        if(number == 0 || number == 1){
            return  number;
        }
        int pre = printFibonacciSeries(number-1);
        int prePrev = printFibonacciSeries(number-2);

        return pre+prePrev;
 
//        return printFibonacciSeries(number - 1) + printFibonacciSeries(number -2);
    }
}
