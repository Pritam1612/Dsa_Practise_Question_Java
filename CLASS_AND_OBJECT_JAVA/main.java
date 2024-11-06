package CLASS_AND_OBJECT_JAVA;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("NAME :: "+person.name);
        person.name = "Govinda";
        System.out.println(person.name);
         Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NAME ");
        String name = sc.next();
        person.name = name;
        System.out.println(name);
        int age = sc.nextInt();
        System.out.println("AGE IS :: "+person.getage(age));

    }
}
