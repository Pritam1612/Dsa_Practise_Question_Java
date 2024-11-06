package RECURSION_IN_JAVA;
import java.util.*;
public class Program_03
{
    public static void main(String[] args)
    {

         Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         System.out.println("SUM OF THE NUMBER "+number + " IS :: "+sumOfDigits(number));
        System.out.println("COUNT OF THE NUMBER "+number + " IS :: "+countOfDigits(number));
        System.out.println("COUNT OF THE NUMBER "+number + " IS :: "+numberCount(number));
        System.out.println("COUNT OF THE NUMBER "+number + " IS :: "+numberCountLong(number));

        System.out.println("ENTER BASE AND IT'S POWER :: ");
        int base = sc.nextInt();
        int power = sc.nextInt();
        System.out.println("ANS OF "+base +" POWER "+power+" IS :: "+powerOfNumber(base,power));
        System.out.println("ANS OF "+base +" POWER "+power+" IS :: "+findPowerAns(base,power));


    }
    public static int sumOfDigits(int number){
        if(number >=0 && number <=9){
            return number;
        }
        int smallAnswer = sumOfDigits(number/10);
        return smallAnswer + number % 10;
    }

    public static int countOfDigits(int number){
        if(number >=0 && number <=9){
            return 1;
        }
        return  countOfDigits(number/10)+1;
    }
    public static int numberCountLong(int number){
        if(number / 10 == 0){
            return 1;

        }
        return 1 + numberCount(number / 10);
    }
    public static int numberCount(long number){
        String ans = Long.toString(number);
        return ans.length();
    }

    public static int powerOfNumber(int base , int power){
//        if(power == 1){
//            return base;
//        }
        if(power == 0){
            return 1;
        }
        return powerOfNumber(base,power-1)*base;

    }

//    Approach 2nd
    public static int findPowerAns(int base , int power){
        if (power == 0){
            return 1;
        }
        int smallAnswer = findPowerAns(base , power/2);

        if(power % 2 == 0)
        {
//            return findPowerAns(base , power/2) * findPowerAns(base,power/2);
            return smallAnswer * smallAnswer;
        }
//        return findPowerAns(base,power/2) * findPowerAns(base, power/2) * base;
       return base * smallAnswer * smallAnswer ;
    }

}
