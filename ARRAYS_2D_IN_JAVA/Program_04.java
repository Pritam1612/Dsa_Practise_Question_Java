package ARRAYS_2D_IN_JAVA;

import java.util.Scanner;

public class Program_04 {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS AND COLUMNS :: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] ansMatrix = new int[row][col];
        interArrayElem(ansMatrix,row,col);
        System.out.println("INPUT MATRIX :: ");
        printMatrix(ansMatrix);
        System.out.println("SPIRAL MATRIX :: ");
        printSpiralOrder(ansMatrix,row,col);
        int [][] matrix = printSpiralMatrix(row);
        System.out.println("NEW COUNT SPIRAL MATRIX :: ");
        printMatrix(matrix);

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
    static void printMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] matrix , int row , int col){
        int topRow = 0;
        int bottomRow = row-1;
        int leftCol = 0 , rightCol = col-1;
        int totalElements = 0;
        while (totalElements < row * col){
//            topRow -> leftCol to rightCol
            for (int j = leftCol; j <=rightCol && totalElements < row * col ; j++) {
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
//            rightCol -> topRow to bottomRow
            for (int i = topRow; i <=bottomRow && totalElements < row * col; i++) {
                System.out.print(matrix[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;
//            bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >=leftCol && totalElements < row * col; j--) {
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;
//            leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >=topRow && totalElements < row * col; i--) {
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }

    }

    static int[][] printSpiralMatrix( int row ){
        int[][] matrix = new int[row][row];
        int topRow = 0;
        int bottomRow = row-1;
        int leftCol = 0 , rightCol = row-1;
        int currentElem = 1;
        while (currentElem <= row * row){
//            topRow -> leftCol to rightCol
            for (int j = leftCol; j <=rightCol && currentElem <= row * row ; j++) {
                        matrix[topRow][j] = currentElem;
                        currentElem++;
            }
            topRow++;
//            rightCol -> topRow to bottomRow
            for (int i = topRow; i <=bottomRow && currentElem <= row * row; i++) {
                    matrix[i][rightCol] = currentElem++;
            }
            rightCol--;
//            bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >=leftCol && currentElem <= row * row; j--) {
                    matrix[bottomRow][j] = currentElem++;
            }
            bottomRow--;
//            leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >=topRow && currentElem <=row * row; i--) {
                matrix[i][leftCol] =currentElem++;
            }
            leftCol++;
        }
        return matrix;

    }
}
