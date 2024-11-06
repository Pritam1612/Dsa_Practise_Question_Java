package RECURSION_IN_JAVA;

import java.util.Scanner;

public class Program_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("JAVA PROGRAMMING CONNECTION DONE");

        System.out.print("ENTER N NUMBERS :: ");
        int number  = sc.nextInt();

        System.out.println("NUMBER IN INCREASING ORDER :: ");
        printNumbers(number);
        System.out.println();

        System.out.println("NUMBER IN DECREASING ORDER :: ");
        reverseNumbers(number);

        System.out.println("NUMBER INCREASING :: ");
        printIncreasing(number);

        System.out.println("ALL NATURAL NUMBER IS ");
        printAllNumbers(number);

        System.out.println("\nENTER END RANGE :: ");
        int endRange = sc.nextInt();
        System.out.println(" NUMBER BETWEEN RANGE IS ::");
        printNumberInRange(number,endRange);

        System.out.println("\nCount Of Numbers Is :: "+countOfDigits(number));
    }
    public static void printNumbers(int number){
        if(number <=0){
            return;
        }
        printNumbers(number - 1);
        System.out.print(number+" ");
    }
    public static void reverseNumbers(int number){
        if(number <= 0){
            System.out.println("\nFUNCTION END");
            return;
        }

        System.out.print(number+ " ");
        reverseNumbers(number - 1);
    }
    static void printIncreasing(int number){
        if(number == 1){
            System.out.println(1);
            return;
        }
        printNumbers(number-1);
        System.out.println(number); // 5-1 > 4-1..........
    }
    static void printAllNumbers(int number){
        int sum = 0;
        if (number <= 0){

            return;
        }
        System.out.print(number+" ");
        printAllNumbers(number-1);

    }

    static void printNumberInRange(int startRange, int endRange){
        int number = 0;
        if(endRange <= startRange){
            return;
        }
        number = endRange-1;
        printNumberInRange(startRange,number);
        System.out.print(number+" ");
    }

        static int count = 0;
    public static int countOfDigits(int number){
       if(number >0){
           count++;
           countOfDigits(number/10);
       }
       return count;
    }

}
