package RECURSION_IN_JAVA.RECURSION_IN_STRING;

import java.util.Scanner;

public class Lecture_02 {
    public static void main(String[] args) {

//        Question 1 - Remove all occurrences of 'a' from string s

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A STRING HERE :: ");
        String s = sc.nextLine();

        printString(s,0);


        System.out.println("\nENTER CHAR YOU WANT TO REMOVE :: ");
        char remover = sc.nextLine().charAt(0);

        System.out.println("\nREMOVING OCCURRENCES FROM "+s);
        System.out.println("METHOD 1 :: "+removeOccurrences(s,0 , remover));
        System.out.println("METHOD 2 :: "+removeChar(s,0,remover));
        System.out.println("METHOD 3 :: "+removeOccurrences2(s,remover));

        System.out.println("REVERSE OF THE STRING IS :: ");
        reverseOfString(s, 0);
        System.out.println("\nREVERSE OF STRING METHOD 2 :: "+reverseOfString2(s,0));
        if(s.equals(reverseOfString2(s,0))){
            System.out.println(s+" STRING IS PALINDROME");
        }
        else {
            System.out.println(s+" NOT A PALINDROME");
        }
        System.out.println("CHECK PALINDROME METHOD 2 :: "+s);
        if(checkPalindrome(s,0,s.length()-1)){
            System.out.println(s+" STRING IS PALINDROME");
        }
        else {
            System.out.println(s+" NOT A PALINDROME");
        }


    }
    public static void printString(String s, int index){
        if (s.length() <= index){
            return ;
        }
        System.out.print(s.charAt(index)+" ");
        printString(s,index+1);
    }

  static String removeOccurrences(String s , int index , char remover){
        if(s.length() == index){
            return "";
        }
      String smallAnswer =  removeOccurrences(s,index+1 , remover);

        char currentChar = s.charAt(index);
        if(currentChar != remover){
            return currentChar + smallAnswer;
        }
        else {
            return smallAnswer;
        }

  }
  static String removeChar(String s , int index , char remover){
        if(s.length() == index) return "";
        String smallWork = removeChar(s,index+1,remover);
        if(remover != s.charAt(index)){
            return s.charAt(index) + smallWork;
        }
        else {
          return smallWork;
        }
  }

  public static String removeOccurrences2(String s , char remover){
        if(s.isEmpty()){
            return "";
        }
        String small = removeOccurrences2(s.substring(1),remover);
        char current = s.charAt(0);
        if(current != remover){
            return current + small;
        }
        else {
            return small;
        }
  }
  public static void reverseOfString(String s , int index){
        if(s.length() <= index){
            return;
        }
        reverseOfString(s , index+1);
      System.out.print(s.charAt(index)+" ");
  }
  public static String reverseOfString2(String s , int index){
        if(s.length() == index){
            return "";
        }
        String newString = reverseOfString2(s , index+1);
        return newString + s.charAt(index);
  }

  public static boolean checkPalindrome(String s , int left , int right){
        if(left <= right){
            return true;
        }
        return (s.charAt(left) == s.charAt(right) && checkPalindrome(s, left+1, right-1));
  }
}
