package ARRAYS_IN_JAVA;

//import java.util.ArrayList;
import java.util.Scanner;

public class ARRAY_2D
{
    public void array2d(int colSize, int rowSize)
    {
         Scanner sc = new Scanner(System.in);
        int [][] myArray = new int[rowSize][colSize];
//        ArrayList<Integer> arrayCon = new ArrayList<>();

        for(int index =0 ; index < myArray.length; index++ )
        {
            for(int col = 0; col < myArray[index].length; col++){

                System.out.println("ENTER VALUE AT INDEX ["+index+"]"+"["+col+"] :: " );
                myArray[index][col] = sc.nextInt();
            }
        }
        for (int i = 0; i <rowSize; i++)
        {
            System.out.println();
            for (int j =0; j< colSize; j++)
            {
                System.out.print(myArray[i][j]+" ");

            }
        }
        System.out.println();

    }
    public int sumOfArray(int arraySize){
         Scanner sc = new Scanner(System.in);
        int sum =0;
        int []sumArray = new int[arraySize];
        for (int index = 0; index <sumArray.length; index++){
            System.out.print("ENTER ELEMENT OF INDEX ["+index+"] :: ");
            sumArray[index] = sc.nextInt();
        }
        for(int index =0; index <sumArray.length; index++){
            sum += sumArray[index];
        }
        return sum;
    }
}
