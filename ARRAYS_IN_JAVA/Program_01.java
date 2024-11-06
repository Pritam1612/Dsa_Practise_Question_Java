package ARRAYS_IN_JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class Program_01 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String [] array = new String[10];
        array[0] = "1";
        array[1] = "2";
        array[2] = "3";
        array[3] = "4";
        array[4] = "5";
        array[5] = "6";
        array[6] = "7";
        array[7] = "8";
        array[8] = "9";
        array[9] = "10";

        int [] myArray ={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> box = new ArrayList<>();
        ArrayList<String> box2 = new ArrayList<>();

        for (int index = 0; index <array.length; index++){
            System.out.println(array[index]);
            box2.add(array[index]);
        }
        System.out.println(box2);

        for (int index = 0; index <array.length; index++){
            box.add(myArray[index]);
        }
        System.out.println(box);

        System.out.println("ENTER SIZE OF ROW :: ");
        int rowSize = sc.nextInt();
        System.out.println("ENTER SIZE OF COLUMN :: ");
        int colSize = sc.nextInt();

        ARRAY_2D arrayBox = new ARRAY_2D();
        arrayBox.array2d(rowSize,colSize);


        System.out.println("**************");

        System.out.println("ENTER SIZE OF ARRAY :: ");
        int arraySize = sc.nextInt();
        System.out.println(arrayBox.sumOfArray(arraySize));
    }
}
