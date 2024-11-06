package CLASS_AND_OBJECT_JAVA;

import java.util.Scanner;

public class Basic_calculations {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Person_Informations info = new Person_Informations();
        System.out.println("ENTER VALUE OF X :: ");
        int X = sc.nextInt();
        System.out.println("ENTER VALUE OF Y :: ");
        int Y = sc.nextInt();
        info.x = X;
        info.y = Y;
        System.out.println("SUM ::"+info.sum());
        System.out.println("SUM ::"+info.sub());
        System.out.println("SUM ::"+info.mul());
        System.out.println("SUM ::"+info.div());


//        public
        System.out.println("**********************************");
        check_access_modifier check = new check_access_modifier();
        check.printMsg();
        System.out.println(check.checkAvability );
        check2 Check2 = new check2();
        Check2.printOutsideFromClass();

        System.out.println("******************************");
//        Protected

        check_access_modifier checkProtected = new check_access_modifier();
        System.out.println(checkProtected.checkProtectedAvability);
        checkProtected.printMsgProtected();
    }
}
class check2{
    void printOutsideFromClass(){
        check_access_modifier check2 = new check_access_modifier();
        System.out.println("SAME PACKAGE BUT OUTSIDE THE CLASS "+check2.checkAvability);
    }
}