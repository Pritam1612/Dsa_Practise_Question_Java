package ARRAYS_2D_IN_JAVA;
import java.util.*;
public class Program_01 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ROW SIZE :: ");
        int rowSize = sc.nextInt();
        System.out.print("ENTER COL SIZE :: ");
        int colSize = sc.nextInt();
        int[][] arr2D = new int[rowSize][colSize];
        interArrayElements(arr2D);

        System.out.print("ENTER ROW SIZE :: ");
        int rowSize2 = sc.nextInt();
        System.out.print("ENTER COL SIZE :: ");
        int colSize2 = sc.nextInt();
        int[][] arr2D2 = new int[rowSize2][colSize2];

        interArrayElements(arr2D2);

        System.out.println("MATRIX 1");
        printArrayElements(arr2D);
        System.out.println("MATRIX 2");
        printArrayElements(arr2D2);

        System.out.println("SUM OF ARRAYS :: ");
        add(arr2D,rowSize,colSize,arr2D2,rowSize2,colSize2);
        System.out.println();
        System.out.println("MULTIPLICATION OF ARRAYS :: ");
        multiply(arr2D,rowSize,colSize,arr2D2,rowSize2,colSize2);
    }

    public static void interArrayElements(int[][] arr){
         Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("ENTER ELEMENTS AT INDEX ["+i+"]["+j+"] :: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void printArrayElements(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void add(int[][] arr1 , int row1, int col1, int[][] arr2, int row2, int col2){
        if(row1 != row2 || col1 != col2){
            System.out.println("WRONG INPUT - OPERATION CANNOT BE PERFORMED DUE TO UN-EXACT MATCH OF ROWS AND COL OF OTHER MATRIX");
            return;
        }
       int sum[][] = new int[row1][col1];
        for (int i = 0; i <row1 ; i++) {
            for (int j = 0; j < col1; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        printArrayElements(sum);
    }
    public static void multiply(int[][] arr, int row1, int col1, int[][] arr2, int row2, int col2){
        if(row1!=col2 || col1 != row2){
            System.out.println("WRONG INPUT - OPERATION CANNOT BE PERFORMED DUE TO UN-EXACT MATCH");
            return;
        }
        int[][] multiply = new int[row1][col2];
        for (int i = 0; i < row1; i++)
        {
            for (int j = 0; j < col2; j++) {

                for (int k = 0; k < col1; k++) // performing addition in that matrix
                {
                    multiply[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
        printArrayElements(multiply);
    }
}
