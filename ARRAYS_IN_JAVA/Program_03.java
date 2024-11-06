package ARRAYS_IN_JAVA;

import java.util.Arrays;

public class Program_03 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("ORIGINAL ARRAY");
        printArray(arr);
        int[] arr3 = arr.clone();
        System.out.println("COPY OF ARRAY BY CLONE");
        printArray(arr3);

        arr3[1] = 9;
        arr3[2] = 88;

        System.out.println("Applying Copy Of MEthod");
        int[] arr4 = Arrays.copyOf(arr, arr.length);
        int[] arr5 = Arrays.copyOf(arr, 3);
        int[] arr6 = Arrays.copyOfRange(arr,1,4);
        printArray(arr4);
        System.out.println("Copy OF Certain Number");
        printArray(arr5);
        System.out.println("CPOY USING RANGE METHOD ");
        arr6[0] =0;
        arr6[1] = 0;
        printArray(arr6);

        System.out.println("ORIGINAL ARRAY ");
        printArray(arr);
        System.out.println("Update Array Of Copy");
        printArray(arr3 );
        System.out.println("COPY OF ARRAY");
        int[] arr2 = arr;
        printArray(arr2);
        printArray(arr);

        System.out.println("My new Array box");
        int[] newArr = new int[3];
        newArr[0] = 1;
        newArr[1] = 2;
        newArr[2] = 3;
        System.out.println("BEFORE APPLYING CHANGE-ARRAY METHOD ");
        for (int i =0; i < newArr.length; i++){
            System.out.print(newArr[i]+ " ");
        }
        System.out.println("\n  AFTER APPLYING CHANGE-ARRAY METHOD");
        chnageArray(newArr);
        for (int i =0; i < newArr.length; i++){
            System.out.print(newArr[i]+ " ");
        }
        System.out.println("\nCHANGING VALUE ");
        int a = 5;
        changeValue(a);
        System.out.println(a);

    }
//    Creating a function that print array for us
    static void printArray(int[] arr){

        for (int index =0; index < arr.length; index++){
            System.out.print(arr[index]+" ");
        }
        System.out.println();
    }
    static void chnageArray(int[] arr){
        for(int i= 0; i < arr.length; i++){
            arr[i] = 0;
        }
    }
    static void changeValue(int a){
        a = 1004;
    }
}
