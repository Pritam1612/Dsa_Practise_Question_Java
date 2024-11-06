package ARRAYS_2D_IN_JAVA;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Program_02 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Program_01 program01 = new Program_01();
        System.out.print("ENTER ROW SIZE :: ");
        int rowSize = sc.nextInt();
        System.out.print("ENTER COL SIZE :: ");
        int colSize = sc.nextInt();
        int[][] arr2D = new int[rowSize][colSize];
        program01.interArrayElements(arr2D);
        program01.printArrayElements(arr2D);
        System.out.println("TRANSPOSE ARRAYS IS :: ");
        program01.printArrayElements(transposeMatrix(arr2D,rowSize,colSize));
        System.out.println("TRANSPOSE ARRAYS IN SAME ARRAY IS :: (ONLY SQUARE MATRIX ALLOWS)");
        transposeMatrixInSame(arr2D,rowSize,colSize);
        System.out.println("90 DEG ROTATION OF ORIGINAL ARRAY :: (ALWAYS ROW = COL) :: ");
        rotateMatrix(arr2D,rowSize);
        System.out.println("ROTATED ARRAY IS :: ");
        program01.printArrayElements(arr2D);

    }
    public static int[][] transposeMatrix(int[][] mar , int row , int col){
        int[][] transposeArray = new int[col][row];
        for (int i = 0; i < col; i++) //row goes to cols
        {
            for (int j = 0; j < row; j++) // cols goes to row
            {
                transposeArray[i][j] = mar[j][i];
            }
        }
        return transposeArray;
    }

    public static void transposeMatrixInSame(int[][] mar , int row , int col) {
        Program_01 program01 = new Program_01();

        if(row == col){
            program01.interArrayElements(mar);
            for (int i = 0; i <col ; i++) {
                for (int j = i; j < row; j++) {
//                Swapping matrix[i][j] = matrix[j][i]
                    int temp = mar[i][j];
                    mar[i][j] = mar[j][i];
                    mar[j][i] = temp;
                }
            }
            program01.printArrayElements(mar);
        }
        else {
            System.out.println("TRANSPOSE NOT POSSIBLE !!");
        }


    }
    static void reverseOfArrays(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotateMatrix(int[][] arr , int row){
        //transpose
        //reverse each row of transpose
        transposeMatrixInSame(arr,row,row);
        for (int i = 0; i < row; i++) {
            reverseOfArrays(arr[i]);
        }
    }
}
