package ARRAYS_IN_JAVA;

import java.util.Scanner;

public class Program_07 {
    public static void main(String[] args) {
        Program_05 program = new Program_05();
        Program_06 program2 = new Program_06();
         Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAYS :: ");
        int size = sc.nextInt();
        int[] myArrays = new int[size];
        program.interArrayElements(myArrays);
        program.printArray(myArrays);
        System.out.println("PATTERN :: TWO POINTER ");
        sortZeroAndOnces(myArrays);
        System.out.println("SORTED ARRAYS IS :: ");
        program.printArray(myArrays);
        System.out.println("PATTERN :: METHOD TWO OF SHORTING");
        sortByZeroAndOnes(myArrays);
        program.printArray(myArrays);
        System.out.println("PRINT ARRAY IN ODD EVEN FORM :: ");
        arrangeOddEven(myArrays);
        program.printArray(myArrays);

        System.out.println("PRINTING SQUARE OF ARRAYS :: INCREASING ORDER :: ");
        program.printArray(sortSquareArrays(myArrays));
        program2.reverseArray(sortSquareArrays(myArrays));
        System.out.println("\nPRINTING SQUARE OF ARRAYS WITHOUT USE REV :: INCREASING ORDER :: ");
        program.printArray(sortSquareArraysWithoutReverseUse(myArrays));
    }
    static void sortZeroAndOnces(int[] arr){
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                zeros++;
            }
        }
//        0 to zeroes-1 : 0, zeroes to n-1 : 1
        for (int i = 0; i <arr.length ; i++) {
            if(i < zeros){
                arr[i] = 0;

            }
            else {
                arr[i] =1;
            }
        }
    }

    static void sortByZeroAndOnes(int[] arr){
        int n = arr.length;
        int left =0, right = n-1;
        while (left < right){
            if(arr[left] == 1 && arr[right] == 0){
                swapElements(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
    }

    static void arrangeOddEven(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n -1  ;
        while (left < right){
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                swapElements(arr, left,right);
                left++;
                right--;
            }

            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 ==1){
                right--;
            }
        }

    }

    static void swapElements(int[] arr, int i , int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }

    public static int[] sortSquareArrays(int[] arr){
        int n = arr.length;
        int left = 0, right = n -1;
        int[] ans = new int[n];
        int k = 0; // Storing answer

        while (left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    public static int[] sortSquareArraysWithoutReverseUse(int[] arr){
        Program_06 program2 = new Program_06();
        int n = arr.length;
        int left = 0, right = n -1;
        int[] ans = new int[n];
        int k = n-1; // Storing answer

        while (left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k--] = arr[left] * arr[left];
                left++;
            }
            else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
//        program2.reverseArray(ans);
        return ans;
    }
}