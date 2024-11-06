package RECURSION_IN_JAVA.RECURSION_IN_STRING;

import java.util.ArrayList;
import java.util.*;
public class Lecture_03 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
//  Question 1::      Given a string, return all its subsequences in an arraylist :: Order must be same *
        System.out.println("ENTER A STRING :: ");
        String s = sc.nextLine();
        ArrayList<String> answer = getSubsequences(s);
       for(String answerString: answer){
           System.out.print(answerString+" ");
       }

//       Question 2::   Given a string, write a method to print all its subsequences
        System.out.println("\nMETHOD 2 :: ");
        getSubsequences2(s ,"");

//        Question 3:: Given an array of integers, print sums of all subsets in it. Output sums can be printed in any order.
        System.out.println("\nSUM OF SUBSET ::");
        int[] arr ={2,4,5};
        returnSum(arr,0,0);

        System.out.println("\nSUM OF SUBSET METHOD 2 ::");
        ArrayList<Integer> result = new ArrayList<>();
        printSum(arr,0,0,result);
        for(int sum:result){
            System.out.print(sum+" ");
        }

    }
    public static ArrayList<String> getSubsequences(String s){
        ArrayList<String> answer = new ArrayList<>();
        //Base case
            if(s.isEmpty()){
                answer.add("");
                return answer;
            }

             char currentChar = s.charAt(0);// 1st CHAR OF OUR STRING

             ArrayList<String> smallAnswer = getSubsequences(s.substring(1)); // IGNORE 1st START WITH 2nd CHAR
             // smallAnswer = ["bc","b","c","",]
            //answer = ["bc","b","c","","abc","ab","ac","a",]
             for(String newString: smallAnswer){
                 answer.add(newString); //bc
                 answer.add(currentChar+newString); //bc+a
             }
             return answer;
    }

    public static void getSubsequences2(String s, String currentAns){
        if(s.isEmpty()){
            System.out.print(currentAns+" ");
            return;
        }
        char currentChar = s.charAt(0); //a
        String remString = s.substring(1); // bc

//        Current char :: chooses to be a part of currentAns
        getSubsequences2(remString, currentAns+currentChar); //"bc","a",  adding currentAns

//        Current char :: does not choose to be a part of currentAns
        getSubsequences2(remString,currentAns); // not adding currentAns

    }


    public static void returnSum(int[] arr, int index , int currentSubSum){
        if(index >= arr.length){
            System.out.print(currentSubSum+" ");
            return;
        }
//        Adding currentSubSum + Ans
        returnSum(arr,index+1,currentSubSum+arr[index]);
//        Not Adding Ans
        returnSum(arr,index+1,currentSubSum);
    }

    public static void printSum(int[] arr, int index, int currentSum, ArrayList<Integer> resultList){
        if(index >= arr.length){
            resultList.add(currentSum);
            return;
        }
        printSum(arr, index+1, currentSum+arr[index],resultList);//Include current elements
        printSum(arr,index+1,currentSum,resultList); // Not Including current elements
    }
}
