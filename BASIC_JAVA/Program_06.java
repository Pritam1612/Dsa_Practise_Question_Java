package BASIC_JAVA;

import java.util.Scanner;

public class Program_06 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A BINARY NUMBER :: ");
        int decimal = sc.nextInt();
        System.out.println("BINARY TO DECIMAL CONVERSION IS :: "+binaryToDecimal(decimal));
        System.out.println("ENTER A BINARY CODE :: ");
        int binary = sc.nextInt();
        System.out.println("BINARY TO DECIMAL IS :: "+decimalToBinary(binary));
    }
    public static int decimalToBinary(int number ){
        int ans = 0;
        int pow =1;

        while (number > 0){
            int parity = number %2;
            ans += (parity * pow);
            pow *=10;
            number /=2;

        }
        return ans;
    }
    public static int binaryToDecimal(int number ){
        int ans =0;
        int pow  =1;
        while (number > 0){
            int unit_digit = number % 10;
            ans += (unit_digit * pow);
            number /=10;
            pow *=2;
        }
        return ans;

    }
}
