package RECURSION_IN_JAVA;

import java.util.Scanner;

public class Program_04 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER AND MULTIPLE :: ");
        int number = sc.nextInt();
        int multiple = sc.nextInt();

            printMultipleFact(number,multiple);
        System.out.println();
        System.out.println(printMultiple(number,multiple));
        System.out.println("SUM OF THE NUMBER IS :: "+sumAlternativeSign(number));


    }





    public static int printMultiple(int number , int multiple){
        if(multiple == 1){
            return number ;
        }
       printMultipleFact(number, multiple - 1);
        System.out.print(" ");
        return number * multiple;
    }

    public static void printMultipleFact(int number , int mul){
        if(mul == 0){
            return;
        }
        printMultipleFact(number , mul-1);
        System.out.print(", "+(number*mul) );
    }
    public static int sumAlternativeSign(int number){
        if(number == 0){
            return 0;
        }
        int smallSum = sumAlternativeSign(number-1);

        if(number%2 == 0){
           return smallSum - number;
        }
        return smallSum + number;
    }
}
