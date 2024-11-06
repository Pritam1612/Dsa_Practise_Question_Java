package RECURSION_IN_JAVA.RECURSION_IN_ARRAYS;

public class Lecture_02 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int[] arr2 ={1,2,3,2,2,5};
        if(targetElem(arr,0,12)){
            System.out.println("FOUND YES");
        }
        else {
            System.out.println("FOUND NO");
        }
        System.out.println("FOUND AT INDEX :: "+printFindIndex(arr,0,5));
        System.out.print("TARGET FOUND AT INDEXES :: " );
        countIndex(arr2,0,2);

    }
    public static boolean targetElem(int[] arr, int index, int target){
     if(index >= arr.length){
         return false;
     }

     return arr[index] == target || targetElem(arr,index+1,target);

/*
     if(arr[index] == target || targetElem(arr,index+1,target)){
         return true;
     }
     else {
         return false;
     }
*/
    }
    public static int printFindIndex(int[] arr, int index , int target){
        if(arr.length <= index){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return printFindIndex(arr,index+1, target);
    }

    public static void countIndex(int[] arrays, int index, int target){

        if(index >= arrays.length){
            return ;
        }
        if(arrays[index] == target){
            System.out.print(index+" ");
        }

        countIndex(arrays,index+1, target);
    }

}
