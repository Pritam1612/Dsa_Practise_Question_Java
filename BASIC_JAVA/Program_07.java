package BASIC_JAVA;

import java.util.Scanner;

public class Program_07 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS :: ");

        int rowCount =sc.nextInt();
        for (int row =1; row <= rowCount; row++){
            System.out.println();
            for (int col = 1; col <= rowCount - row +1 ; col++){
                System.out.print("*"+" ");
            }
            for (int space = 1; space <= row-1; space++) {
                System.out.print("_"+" ");
            }
            for (int printstr = 1; printstr <=row-1 ; printstr++) {
                System.out.print("_"+" ");
            }
            for (int col = 1; col <=rowCount-row+1 ; col++) {
                System.out.print("*"+" ");
            }

        }
        for(int row =1; row <= rowCount ; row++){
            System.out.println();

            for(int col = 1 ; col <=row ; col ++ ){
                System.out.print("*" + " ");
            }
            for (int space = 1; space <=rowCount-row ; space++) {
                System.out.print("_"+" ");
            }
            for (int space = 1; space <=rowCount-row ; space++) {
                System.out.print("_"+" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("*"+" ");
            }
        }
        System.out.println();

    }
}
