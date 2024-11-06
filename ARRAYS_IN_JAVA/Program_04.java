package ARRAYS_IN_JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class Program_04 {
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY :: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("ENTER NUMBER TO FIND COUNT IN ARRAY ");
        int countnum = sc.nextInt();
        System.out.println("THE COUNT OF "+countnum+ " IN THE ARRAYS IS :: "+countNumber(size,myArray,countnum));
        System.out.println("LAST OCCURRENCE OF "+countnum+" IS "+lastOccurrence(myArray,countnum));
        System.out.println("THE ARRAY IS SHORTED "+isSorted(myArray));
        System.out.println(" AFTER SHORTING ARRAY IS :: ");
        smallestAndLargest(myArray);
    }

    static void printArray(int myArray[])
    {
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }

    static int countNumber(int size, int myArray[], int countNum){

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER "+size+" ELEMENT IN ARRAY :: ");
        for (int i =0; i <myArray.length; i++){
            myArray[i] = sc.nextInt();
        }

        int count=0;
        for (int i =0; i<myArray.length; i++){
            if (myArray[i] == countNum){
                count++;
            }
        }
        return count;
    }
    static void inputElementsInArray(int size, int myArray[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER "+size+" ELEMENT IN ARRAY :: ");
        for (int i =0; i <myArray.length; i++){
            myArray[i] = sc.nextInt();
        }
    }

    static int lastOccurrence(int[] arr, int findNum){
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findNum){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    static boolean isSorted(int[] arr){
        boolean checkNum = true;
        for (int i = 1; i < arr.length; i++) {
//            Reason To Start array with one become when its runs in initial level for i-1 (0-1) It gives bound(range) error
            if (arr[i] < arr[i-1]){
                checkNum = false;
                break;
            }
        }
        return checkNum;
    }
    static void smallestAndLargest(int arr[]){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        int arr1 = arr.length;
        System.out.println("\nSMALLEST IS "+arr[0] +" LARGEST IS "+arr[arr1-1]);
    }
}
