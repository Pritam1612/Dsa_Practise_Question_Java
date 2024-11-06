package RECURSION_IN_JAVA.RECURSION_IN_STRING;
import java.util.*;
public class LECTURE_01 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
  /*
     System.out.println("ENTER AN STRING :: ");
        String sentence = sc.next();
        System.out.println(sentence);

   */
        System.out.println("ENTER A STRING");
        String fullSentence = sc.nextLine();
        System.out.println(fullSentence);

        System.out.println("CHAR AT INDEX IS :: "+fullSentence.charAt(1));

        for (int i = 0; i < fullSentence.length(); i++) {
            System.out.println("CHAR AT INDEX "+i+" IS :: "+fullSentence.charAt(i));
        }
//        System.out.println("SUB STRING OF MAIN STRING IS :: "+fullSentence.substring(2,8));

        for (int i = 0; i < fullSentence.length(); i++) {
            if (fullSentence.charAt(i) == 'a'){
                continue;
            }
            else {
                System.out.print(fullSentence.charAt(i)+" ");
            }
        }
    }
}
