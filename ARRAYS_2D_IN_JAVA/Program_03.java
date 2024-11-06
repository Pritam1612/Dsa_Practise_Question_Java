package ARRAYS_2D_IN_JAVA;

import java.util.Scanner;

public class Program_03 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS :: ");
        int rowCount = sc.nextInt();
        int[][] ans = pascalTriangle(rowCount);
        System.out.println("PASCAL TRIANGLE IS :: ");
        printMatrix(ans);

       ;

    }
    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("["+matrix[i][j]+"] ");
            }
            System.out.println();
        }

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
    static int[][] pascalTriangle(int row){
        int[][] ans = new int[row][];
        for (int i = 0; i < row; i++) {
                ans[i] = new int[i+1]; // i th row has i+1 columns
                ans[i][0] = ans[i][i] = 1; // first and last index is 1
            for (int j = 1; j <i ; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }

        return ans;
    }

}
