package ARRAYS_IN_JAVA;
import java.util.*;
public class Program_06 {
    public static void main(String[] args) {
        Program_05 program05 = new Program_05();
         Scanner sc = new Scanner(System.in);
        System.out.println("SIZE OF ARRAY :: ");
        int size = sc.nextInt();
        int[] myarray = new int[size];
        program05.interArrayElements(myarray);
        program05.printArray(myarray);

        int a = 9 , b =3;
        swapElements(a,b);
        System.out.println("SWAP WITHOUT TEMP");
        swapWithoutTemp(a,b);
        System.out.println("REVERSE OF THE ARRAY IS ");
        reverseArray(myarray);
        System.out.println("\n REVERSE OF THE ARRAY BY METHOD ||  IS ");
        int[] myArrays = myarray;
        int[] newReverseArray = reverseOfArray(myArrays);
        printTheArray(newReverseArray);
        program05.printArray(newReverseArray); // both are same

        System.out.println("WITHOUT CREATING NEW ARRAY IN MEMORY SWAP VALUES ARE :: ");
        reverseOfArrayWithoutNewAray(myarray);
        printTheArray(myarray);
        System.out.println("ENTER NUMBER WHERE YOU WANT TO ROTATE THE ARRAYS :: ");
        int rotateNum = sc.nextInt();
        System.out.println("ROTATED ARRAY IS :: ");
        rotateArrays(myarray,rotateNum);
        System.out.println("ROTATED ARRAY BY METHOD 2nd :: ");

        program05.printArray(rotate(myarray,rotateNum));

        System.out.println("\nPrinting Frequency arrays ::");
        int[] ferq = makeFrequencyArray(myarray);
        System.out.println("ENTER NUMBER OF QUERIES :: ");
        int query = sc.nextInt();

        while (query > 0){
            System.out.println("ENTER NUMBER TO SEARCH");
            int search = sc.nextInt();
            if(ferq[search] > 0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            query--;
        }

    }
    static void swapElements(int a , int b){
        System.out.println("Original values before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    int temp = a;
        a =b;
        b =temp;
        System.out.println("Values after swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

//        a =3, b= 9
    }
    static void swapWithoutTemp(int a, int b){
        System.out.println("Original values before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
// a =9 , b =3
        b = a - b;   // 9 - 3  =6
        a = a - b;   // 9 - 6 = 3
        b = a + b;   // 6 + 3 = 9
// a =3 , b = 9
        System.out.println("Values after swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    static void reverseArray(int[] arr){

        for (int i = arr.length -1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }

    static int[] reverseOfArray(int[] arr){
        int[] ans = new int[arr.length];
        int j =0;
        for (int i = arr.length -1; i >=0; i--){
            ans[j++] = arr[i];

        }
        return ans;
    }
    static void printTheArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swapArray(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] =temp;
    }
    static void reverseOfArrayWithoutNewAray(int[] arr){
        int i =0, j = arr.length-1;
        while (i < j){
            swapArray(arr,i ,j);
            i++;
            j--;
        }
    }
    static void rotateArrays(int[] arr, int rotateBy){
//       1,2,3,4,5,6,7  By 5
//        System.out.println("ROTATING THE ARRAYS :: ");
//        7 -5 =2
            rotateBy = rotateBy % arr.length;
        for (int i= arr.length - rotateBy; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for (int i =0; i <arr.length-rotateBy; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] rotate(int[] arr, int rotate){
        int n = arr.length;
        rotate = rotate % n;
        int[] ans  = new int[n];
        int j = 0;
        for (int i = n-rotate; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n-rotate; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[1000005];
        for (int i =0; i< arr.length ; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
}
