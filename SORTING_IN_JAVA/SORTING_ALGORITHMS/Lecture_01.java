package SORTING_IN_JAVA.SORTING_ALGORITHMS;
import java.util.Scanner;
public class Lecture_01 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY :: ");
        int size = sc.nextInt();
        int[] arr= new int[size];
        System.out.println("ENTER "+size+" ELEMENTS :: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("\n********** METHOD 1 ***********");
        System.out.print("BEFORE :: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.print("\nAFTER :: ");
        sortingAlgo(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println("\n*********** METHOD 2 ************");
        System.out.print("BEFORE :: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.print("\nAFTER :: ");
        sortingAlgo2(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void sortingAlgo(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
    public static void sortingAlgo2(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] == 0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
}
