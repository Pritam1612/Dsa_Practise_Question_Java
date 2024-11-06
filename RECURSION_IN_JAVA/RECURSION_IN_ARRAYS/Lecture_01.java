package RECURSION_IN_JAVA.RECURSION_IN_ARRAYS;

public class Lecture_01 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        printArrayElem(arr,0);
        System.out.println();
        int[] arr2 ={1,6,9,1,20};
        printArrayElem(arr2,0);
        System.out.println();
        System.out.println("MAX ELEMENTS IS :: "+maxOfArrays(arr2,0));
        System.out.println("MAX ELEMENTS IS :: "+getMax(arr2,arr2.length));
        System.out.println("SUM OF ELEMENTS IS :: "+sumOfArray(arr2, arr2.length));
        System.out.println("SUM OF ELEMENTS IS :: "+getSum(arr2, 0));

    }
    public static void printArrayElem(int[] array, int index)
    {
        if(array.length == index){
            return ;
        }
        System.out.print(array[index]+" ");
        printArrayElem(array, index+1 );
    }
    public static int maxOfArrays(int[] array, int index)
    {
        if(array.length  == index){
            return 0;
        }
        int smallAnswer = maxOfArrays(array,index+1);

        return  Math.max(array[index],smallAnswer);
    }

    static int getMax(int[] arr, int arrSize)
    {
        if(arrSize == 0){
            return 0;
        }
        return Math.max(arr[arrSize-1],getMax(arr,arrSize-1));
    }
    static int sumOfArray(int[] arr, int arrSize)
    {

        if(arrSize == 0){
           return 0;
        }
      return sumOfArray(arr, arrSize-1) + arr[arrSize-1];
    }
    public static int getSum(int[] array , int index)
    {
        if(array.length == index){
            return 0;
        }
        int smallAnswer =  getSum(array, index+1);
        return smallAnswer  + array[index];
    }
}
