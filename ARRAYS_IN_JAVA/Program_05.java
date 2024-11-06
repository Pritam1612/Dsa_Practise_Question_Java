package ARRAYS_IN_JAVA;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Program_05 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY :: ");
        int size = sc.nextInt();
        System.out.println("ENTER TARGET ELEMENTS SUM :: ");
        int target = sc.nextInt();
        int[] myArrays = new int[size];
        interArrayElements(myArrays);
        printArray(myArrays);
        System.out.println("ELEMENTS FOUND "+ pairSum(myArrays,target));
        System.out.println("PAIR OF THREE SUM IS "+pairSumOfThree(myArrays,target));
        System.out.println("UNIQUE ELEMENTS IN ARRAYS IS (ALWAYS ODD) :: "+uniqueElements(myArrays));
        System.out.println("MAX ELEMENTS IN ARRAY IS :: "+findMax(myArrays));
        System.out.println("MIN ELEMENTS IN ARRAY IS :: "+findMin(myArrays));
        System.out.println("2nd MAX ELEMENTS IN ARRAY IS :: "+findSecondMax(myArrays));
        System.out.println("2nd MIN ELEMENTS IN ARRAY IS :: "+findSecondMin(myArrays));
        Arrays.sort(myArrays);
        System.out.println("SECOND MIN VALUE IS :: "+myArrays[1]);


    }
    public static void interArrayElements(int[] arr){
         Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ELEMENTS OF ARRAYS :: ");
        for (int i =0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static int pairSum(int[] arr, int target){
        int n = arr.length;
        int ans =0;
        for (int i = 0; i < n; i++) //First number
        {
                for (int j = i+1; j <n; j++ ) // Second Number
                {
                    if(arr[i] + arr[j] == target){
                        ans++;
                    }
                }
        }
        return ans;
    }
    public static int pairSumOfThree(int[] arr, int target){
        int n = arr.length;
        int ans =0;
        for (int i = 0; i < n; i++) //First number
        {
            for (int j = i+1; j <n; j++ ) // Second Number
            {
               for (int k = j+1; k <n; k++) // Third Number
               {
                   if(arr[i] + arr[j] + arr[k] == target){
                       ans++;
                   }
               }
            }
        }
        return ans;
    }
    public static int uniqueElements(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i +1; j <n ; j++) {
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans =-1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i =0; i <arr.length; i++){
            if( arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int findSecondMax(int[] arr){
        int max = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int seconmMax = findMax(arr);
        return seconmMax;
    }
    public static int findMin(int[] arr){
        int min  = Integer.MAX_VALUE;
        for(int i =0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int findSecondMin(int[] arr){
        int min = findMin(arr);
        for (int i =0; i < arr.length; i++){
            if(arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int secondMin = findMin(arr);
        return secondMin;
    }
}
