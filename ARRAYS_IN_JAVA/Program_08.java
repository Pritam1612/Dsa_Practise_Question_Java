package ARRAYS_IN_JAVA;
import java.util.*;
public class Program_08 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Program_05 program05 = new Program_05();
        System.out.println("ENTER SIZE OF ARRAYS :: ");
        int size = sc.nextInt();
        int[] myArrays = new int[size];
        program05.interArrayElements(myArrays);
        System.out.println("PREFIX SUM OF ARRAYS");
        program05.printArray(makePrefixSum(myArrays));
        System.out.println("PREFIX SUM OF ARRAYS :: WITHOUT CREATING NEW ARRAYS ::");
        program05.printArray(makePrefixSumInSame(myArrays));

    }
    static int[] makePrefixSum(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i =1; i < n; i++){
            pref[i] = pref[i-1]+arr[i];
        }
        return pref;
    }
    static int[] makePrefixSumInSame(int[] arr){
        int n = arr.length;
// arr[o] = first value and same both are same
        for (int i =1; i < n; i++){
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }

}
