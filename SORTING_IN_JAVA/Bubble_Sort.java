package SORTING_IN_JAVA;

public class Bubble_Sort {
    public static void main(String[] args) {
        System.out.println("WELCOME! IN SORTING IN JAVA");
        System.out.println("Program 1:: ");
        int[] arr = {7,6,5,4,3};
        System.out.print("After :: ");
        for(int i :arr){
            System.out.print(i+" ");
        }
        bubbleSort(arr);
        System.out.print("\nBefore :: ");
        for(int i :arr){
            System.out.print(i+" ");
        }

        System.out.println("\nOptimised Above Program Now :: ");
        int[] arr2 = {7,6,5,4,3,2,1,0};
        System.out.print("After :: ");
        for(int i :arr2){
            System.out.print(i+" ");
        }
        bubbleSort2(arr2);
        System.out.print("\nBefore :: ");
        for(int i :arr2){
            System.out.print(i+" ");
        }
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                // last i elements are already at correct sorted so no need to check it
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void bubbleSort2(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = false; // has any swapping happened
            for (int j = 0; j < arr.length-i-1; j++) {
                // last i elements are already at correct sorted so no need to check it
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true; // same swap has happened
                }
            }
            if(!flag){ // flag == false
                return; // have any swaps happened ?
            }
        }
    }
}
