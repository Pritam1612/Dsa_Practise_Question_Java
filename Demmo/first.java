import CLASS_AND_OBJECT_JAVA.Person_Informations;
import CLASS_AND_OBJECT_JAVA.check_access_modifier;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Person_Informations info = new Person_Informations();

        System.out.println("********************************");
        check_access_modifier check = new check_access_modifier();
        System.out.println("OUTSIDE THE PACKAGE , NON - CHILD CLASS "+check.checkAvability);
        APP3 obj = new APP3();
        obj.printFromChild();
        System.out.println("*******************");
        check_access_modifier checkProtected = new check_access_modifier();
        System.out.println("OUTSIDE PACKAGE BUT NON - CHILD CLASS :: PROTECTED NOT ACCESIBLE");
        obj.printProtectedMsg();

        System.out.println("******************************************* ");



        System.out.println(info.car("HUWNDIA"));
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Principle Value ");
        float principle = sc.nextFloat();
        System.out.print("Enter Rate Of Interest :: ");
        float rateOfInterest = sc.nextFloat();
        System.out.print("Enter Time :: ");
        float time = sc.nextFloat();
        float simpleInterest = (principle * rateOfInterest * time)/100;
        System.out.printf("At Principle value of :: %f\nRate Of Interest Is :: %f\nAnd Time Duration Is %f\nSimple Interest = %f",principle,rateOfInterest,time,simpleInterest);
    }
}

class APP3 extends check_access_modifier{
            void printFromChild(){
                APP3 obj3 = new APP3();
                System.out.println("OUTSIDE PACKAGE AND WITHIN CHILD CLASS "+obj3.checkAvability);
            }
            void printProtectedMsg(){
                APP3 obj3 = new APP3();
                System.out.println("OUTSIDE PACKAGE AND WITHIN CHILD CLASS  "+obj3.checkProtectedAvability);
            }
}