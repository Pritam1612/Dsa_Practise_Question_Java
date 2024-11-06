package BASIC_JAVA;

import java.util.Scanner;

public class Program_02 {
    public static void main(String[] args) {
//        Variables in java
        int x = 5;
        double y = 2.6;
        String name = "Sanjna";
        System.out.println(x);
        System.out.println(y);
        System.out.println(name);
        char ch = 'x';
        int ascii = (int)ch;
        System.out.print("ASCII VALUE OF "+ch + " IS :: ");
        System.out.println(ascii);

//        User_Input From User

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name :: ");
        String userName =  scanner.next();
        System.out.println("Enter a Integer Number ");
        int number = scanner.nextInt();
        System.out.println("Enter a Double Number ");
        double number_02 = scanner.nextDouble();
        System.out.println("Enter Char Value :: ");
        char Char = scanner.next().charAt(0);
        System.out.println("String Value Is ::  "+ userName + ", Integer Value Is :: "+ number + ", Double value Is :: "+ number_02+", Char Value IS :: "+Char);

        int num =20;

    }
}
