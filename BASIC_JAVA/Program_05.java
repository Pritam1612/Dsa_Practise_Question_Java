package BASIC_JAVA;
import  java.util.Scanner;
public class Program_05 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("ENTER RANGE OF ROW :: ");
        int rowRange = sc.nextInt();

        System.out.println(" \n PATTERN 1");
//        First Function
        rectangularPattern(rowRange);
        System.out.println(" \n PATTERN 2");
//        function 2
        rectangularPattern2(rowRange);
        System.out.println(" \n PATTERN 3");
//        Function 3
        rectangularPattern3(rowRange);
//          function 4
        System.out.println("\n PRINT PATTERN 4");
        printPattern(rowRange, 6);

//        function 5
        System.out.println("\n PRINT PATTERN 5");
        printPatternAdavnce(rowRange , 6);

//        function 6
        System.out.println("\n PRINT PATTERN 6");
        reverseGTriangle(rowRange);

//        function 7
        System.out.println("\n PRINT PATTERN 7");
        printPyramid(rowRange);

 //        function 7-part 2
        System.out.println("\n PRINT PATTERN 7 - part -2");
        printPyramid_1(rowRange);


//        function 8
        System.out.println("\n PRINT PATTERN 8 ");
        printNumericRectangle(rowRange);


//        function 9
        System.out.println("\n PRINT PATTERN 9 ");
        evenOdd(rowRange,6);

//       function 7-part 3
        System.out.println("\n PRINT PATTERN 7 - part -3");
        printPyramid_2(rowRange);

//       function 7-part 4
        System.out.println("\n PRINT PATTERN 7 - part -4");
        printPyramid_3(rowRange);
    }

//    function 1
    public static void rectangularPattern( int rowRange){
        for (int row =1 ; row <= rowRange ; row++){
            System.out.println();
            for (int col =1; col<= rowRange; col++){
                System.out.print(col +" ");
            }
        }
    }
//    function 2
    public static void rectangularPattern2( int rowRange){
        for(int row =1; row <= rowRange ; row++){
            System.out.println();
            for(int col = 1 ; col <=row ; col ++ ){
                System.out.print(col + " ");
            }
        }
    }
//    function 3
    public static void rectangularPattern3(int rowRange){
        int num =1;
        for(int row = 1; row <= rowRange; row++){
            System.out.println();
            for (int col = 1 ; col <=row ; col++){
                System.out.print(num + " ");
                num++;
            }

        }
    }

//    function 4
    public static void printPattern(int rowCount , int colCount){
        for (int row =1; row <= rowCount; row++){
            System.out.println();
            for (int col =1; col <= colCount; col++ ){
                System.out.print(" * ");
            }
        }
    }
//    function 5
    public static void printPatternAdavnce(int rowCount , int colCount){
        for (int row =1; row <= rowCount; row++){
            System.out.println();

            for(int col = 1; col<= colCount; col++ ){
                if(row ==1 || row == rowCount || col ==1 || col == colCount){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
        }
    }
//    function 6
    public static void reverseGTriangle(int rowCount){
        for (int row =1; row <= rowCount; row++){
            System.out.println();
//            for (int col = 1; col <= rowCount - row +1 ; col++){
//                System.out.print("*");
//            }
            for (int col = row; col <= rowCount ; col++){
                System.out.print("*");
            }
        }
    }
//    function 7
    public  static void printPyramid(int rowRange){

//        Main pyramid box

        for(int row =1; row <= rowRange; row++){
            System.out.println();
//            lH pyramid
            for (int space =1; space <= rowRange-row; space++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }
//            RH pyramid
//            for (int space =rowRange; space <=1; space++){
//                System.out.print(" ");
//            }
            for (int col =2; col <=row; col++){
                System.out.print("*");
            }
        }

    }
//    function 7 - part 2

    public static void printPyramid_1(int rowRange){
        for (int row =1; row<= rowRange; row++){
            System.out.println();
            for (int space =1; space <= rowRange-row; space++){
                System.out.print(" ");
            }
            for (int col =1; col <= 2*row-1; col++){
                System.out.print("*");
            }
        }
    }

//    function 8
    public static void printNumericRectangle(int rowRange){

        for(int row =1; row <=rowRange; row++){
            System.out.println();
            for (int col =row; col<=rowRange; col++){
                System.out.print(col);
            }
            for(int col =1; col <= row -1; col++){
                System.out.print(col);
            }
        }
    }
//    function 9
    public static void evenOdd(int rowRange , int colRange){
        for (int row =1; row <=rowRange; row++){
            System.out.println();
            for (int col =1; col <=colRange; col++){
                if((row+col)%2 == 0){
                    System.out.print("1");
                }
                else {
                    System.out.print("2");
                }
            }
        }
    }
//    function 7 - part 3
    public static void printPyramid_2(int rowRange){
        for (int row = 1; row <= rowRange; row++){
            System.out.println();
            for (int spcae = 1; spcae <= rowRange -row; spcae++){
                System.out.print(" ");
            }
            for (int col =1; col <= 2*row-1; col++){
                System.out.print(col);
            }
        }
    }
    public static void printPyramid_3(int rowRange){
        for (int row =1; row <=rowRange; row++){
            System.out.println();
            for (int space =1; space <= rowRange -row; space++){
                System.out.print(" ");
            }
            for (int col =1; col <=row; col++){
                System.out.print(col);
            }
//            reverse
//            int num =1;
//            for(int col =2; col <=row; col++){
//                System.out.print(num);
//                num++;
//            }
            for (int col =row-1; col >=1; col--){
                System.out.print(col);
            }
        }
    }
}
