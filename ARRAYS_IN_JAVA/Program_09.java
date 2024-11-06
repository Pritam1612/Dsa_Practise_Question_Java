package ARRAYS_IN_JAVA;

import java.util.Scanner;

public class Program_09 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Program_05 program = new Program_05();
        System.out.println("ENTER ARRAY SIZE ");
        int size = sc.nextInt();
        int[] arr = new int[size+1];
        System.out.println("ENTER "+size+" ELEMENTS IN ARRAYS ");
        for (int i = 1; i <=size ; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefSum = makePrefixSumInSame(arr);
        System.out.println("ENTER NUMBER OF QUERIES :: ");
        int query = sc.nextInt();
        while (query-- > 0){
            System.out.println("ENTER RANGE :: ");
            int left = sc.nextInt();
            int right = sc.nextInt();
            int ans = prefSum[right] - prefSum[left-1];
            System.out.println("SUM :: "+ans);
        }
        int[] myArrays = new int[size];
        program.interArrayElements(myArrays);
        System.out.println("EQUAL PARTITION POSSIBLE :: "+equalSumPartition(myArrays));
    }
    static int[] makePrefixSumInSame(int[] arr){

// arr[o] = first value and same both are same
        for (int i =1; i < arr.length; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }
    static int findArraysSum(int[] arr){
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
            int totalSum = findArraysSum(arr);
            int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int sufixSum = totalSum - prefixSum;
            if(sufixSum == prefixSum){
                return true;
            }
        }
        return false;
    }

}
