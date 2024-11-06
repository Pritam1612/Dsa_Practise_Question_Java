package ARRAYS_2D_IN_JAVA;

import java.util.Scanner;

public class Program_05 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROW AND COL :: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        interArrayElem(matrix,row,col);
        System.out.println("ENTER RECTANGLE BOUNDARIES l1, r1, l2, r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("RECTANGLE SUM IS :: "+findSum(matrix, l1,r1,l2,r2));
        System.out.println("RECTANGLE SUM IS :: "+findSum2(matrix, l1,r1,l2,r2));

    }
    public static int findSum(int[][] matrix , int l1, int r1, int l2, int r2){
        int totalSum = 0;
        for (int i = l1; i <=l2 ; i++) {
            for (int j = r1; j <=r2 ; j++) {
              totalSum+=  matrix[i][j] ;
            }
        }

        return totalSum;
    }
    static void findPrefixSumMatrix(int[][] matrix){
        int r = matrix.length;
        int c =matrix[0].length;

        // traverse horizontally
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }
    public static int findSum2(int[][] matrix , int l1, int r1, int l2, int r2){
        int totalSum = 0;
        findPrefixSumMatrix(matrix);
        for (int i = l1; i <=l2 ; i++) {
            // r1 to r2 sum for row i
            if(r1 >= 1){
                totalSum+= matrix[i][r2] - matrix[i][r1-1];

            }
            else {
                totalSum += matrix[i][r2];
            }
        }
        return totalSum;
    }
    static void interArrayElem(int[][] arr , int row , int col)
    {
        int totalElem = row * col;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER "+totalElem+" ELEMENTS :: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
