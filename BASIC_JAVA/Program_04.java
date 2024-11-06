package BASIC_JAVA;

import java.time.chrono.MinguoDate;
import java.util.Scanner;

public class Program_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER :: ");
        int number = sc.nextInt();

//        function -> 1
        countOfNumber(number);

//        function -> 2
        sumOfGivenDigits(number);

//        function -> 3
        System.out.println("The Reveres of the number "+number+" IS :: "+reverseOfNumber(number));
        System.out.println("ENTER END RANGE :: ");
        int endRange = sc.nextInt();
        System.out.println("Sum Of The Range Is "+countSumOfRange(endRange));

//        function -> 4
        System.out.println("ENTER NUMBER TO PRINT FACTORIAL :: ");
        int factNum = sc.nextInt();
        printFactorial(factNum);
        
//        function -> 5
        System.out.println("ENTER BASE VALUE :: ");
        int base = sc.nextInt();
        System.out.println("ENTER POW VALUE :: ");
        int pow = sc.nextInt();
        printPowAns(base,pow);
    }

    public static void countOfNumber(int number){
        int countOfDigits =0;
        int originalNumber = number;

        while ( number >0){
            number /=10;
            countOfDigits++;
        }

        System.out.println("COUNT OF DIGITS AT NUMBER "+originalNumber+" IS :: "+ countOfDigits);
    }

    public static void sumOfGivenDigits(int number){
        int sumOfDigits = 0;
        int originalNumber = number;

        while (number > 0){
            sumOfDigits +=number % 10;
//            sumOfDigits = sumOfDigits + number % 10;
            number /= 10;
        }
        System.out.println("SUM OF DIGITS AT NUMBER "+originalNumber+" IS :: "+ sumOfDigits);
    }

    public static int reverseOfNumber(int number){
        int revese = 0;
        int original = number;
        while (number >0){
            revese = revese * 10 + number %10;
            number /=10;
        }

        return revese;
    }

    public static int countSumOfRange(int endRange){
        int answer =0;
        for (int index =1 ; index <= endRange ; index++){
            if (index %2 == 0){
                answer = answer - index;
            }
            else {
                answer = answer + index;
            }
        }
        return answer;
    }

    public static void printFactorial(int factNum){
        int initialFact =1;
        int grandSum = 0;
        for (int index =1; index <=factNum; index++){
            initialFact = initialFact * index;
            System.out.println("FACTORIAL OF "+index+" IS :: "+initialFact);
            grandSum +=initialFact;
        }
        System.out.println("SO THE GRFAND SUM IS :: "+grandSum);
        System.out.println("FINAL ANSWER IS COMPLETED");
    }

    public static void printPowAns(int base , int pow){
        int answer = 1;
        for (int index = 1; index <=pow; index ++){
            answer *= base;
        }
        System.out.println("The Final ANSWER IS "+answer);
    }
}
