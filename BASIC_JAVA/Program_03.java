package BASIC_JAVA;
import java.util.Scanner;
public class Program_03 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.printf("ENTER VALUE OF A :: ");
        Integer valueA = sc.nextInt();
        System.out.printf("ENTER VALUE OF B :: ");
        Integer valueB = sc.nextInt();
        System.out.printf("ENTER VALUE OF C :: ");
        Integer valueC = sc.nextInt();
        System.out.printf("%d %d %d",valueA,valueB,valueC);
        System.out.println();

                if(valueA >(valueB & valueC)) {

                    if((valueA == valueB) &&  (valueA & valueB) > valueC){
                        System.out.printf("%d %d Is Greater then %d ",valueA,valueB,valueC);
                    }
                    else if((valueA == valueC) &&  (valueA & valueC) > valueB){
                        System.out.printf("%d %d Is Greater then %d ",valueA,valueC,valueB);
                    }
                    else {
                        System.out.printf("%d Is Greater then %d and %d ", valueA, valueB, valueC);
                    }
                }
                else if (valueB > (valueA & valueC)) {

                    if((valueB == valueA) &&  (valueA & valueB) > valueC){
                        System.out.printf("%d %d Is Greater then %d ",valueA,valueB,valueC);
                    }
                    else if((valueB == valueC) &&  (valueB & valueC) > valueA){
                        System.out.printf("%d %d Is Greater then %d ",valueB,valueC,valueA);
                    }
                    else {
                        System.out.printf("%d Is Greater then %d and %d ", valueB, valueA, valueC);
                    }
                }
                else if (valueA==(valueB & valueC) && valueB==(valueA & valueC) && valueC ==(valueA & valueB)) {
                    System.out.printf("All Values are equal");
                }

                else {
                    if((valueC == valueA) &&  (valueA & valueC) > valueB){
                        System.out.printf("%d %d Is Greater then %d ",valueA,valueC,valueB);
                    }
                    else if((valueB == valueC) &&  (valueB & valueC) > valueA){
                        System.out.printf("%d %d Is Greater then %d ",valueB,valueC,valueA);
                    }
                    else {
                        System.out.printf("%d Is Greater then %d and %d ", valueC, valueA, valueB);
                    }
                }
    }
}
