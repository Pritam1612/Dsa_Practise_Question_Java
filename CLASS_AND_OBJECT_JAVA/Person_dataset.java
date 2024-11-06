package CLASS_AND_OBJECT_JAVA;

import java.util.Scanner;

public class Person_dataset {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);


        Person_Informations info = new Person_Informations();


        System.out.println("ENTER BUYERS NAME HERE :: ");
        String name = sc.next();
        System.out.println("ENTER AGE OF BUYERS :: ");
        int age = sc.nextInt();
        System.out.println("ENTER NAME OF THE CAR :: ");
        String carName =  sc.next();
        System.out.println("ENTER THE PRICE OF THE CAR :: ");
        double price = sc.nextDouble();
        System.out.println("ENTER THE DOWN PAYMENT OF THE CAR :: ");
        double downPyamentCar = sc.nextDouble();


        System.out.println("SO HELLO "+info.userName(name)+" YOUR AGE IS "+info.age(age));
        System.out.println("YOU PURCHASED BRAND NEW "+info.car(carName)+" WITH THE PRICE AMOUNT OF $ "+info.carPrice(price) +" YOUR DOWN PAYMENT AMOUNT OF THE CAR IS :: $ "+info.downPyament(downPyamentCar));
        System.out.println("NOW YOUR TOTAL REMAINING AM AMOUNT IS ::$ "+info.remainAmount(price,downPyamentCar));


    }
}
