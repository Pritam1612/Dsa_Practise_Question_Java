package SORTING_IN_JAVA;

public class Selection_Sort {
    public static void main(String[] args) {
         int[] arr = {7,6,5,4,3,2,1};
         selectionSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("\n Method 2::");
        int[] arr2 = {7,6,5,4,3,2,1};
        selectionSort2(arr2);
        for (int j : arr2) {
            System.out.print(j + " ");
        }
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void selectionSort2(int[] arr){
        for (int i = 0; i < arr.length-1; i++)
        {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
              if(arr[j] < arr[min_index]){
                  min_index = j;

              }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }
    }




}
