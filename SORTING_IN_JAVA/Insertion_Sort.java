package SORTING_IN_JAVA;

public class Insertion_Sort {
    public static void main(String[] args) {
        System.out.println("METHOD 1 :: ");
        int[] arr = {8,4,9,6,1,5,};
        System.out.print("BEFORE :: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.print("\nAFTER :: ");
        insertionSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println("\nMETHOD 2 :: ");
        int[] arr2 = {8,4,9,6,1,5,};
        System.out.print("BEFORE :: ");
        for(int i : arr2){
            System.out.print(i+" ");
        }
        System.out.print("\nAFTER :: ");
        insertionSort2(arr2);
        for(int i : arr2){
            System.out.print(i+" ");
        }

    }
    public static void insertionSort(int[] arr){
//        Assume index 0 is already a part of sort array
        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    public static void insertionSort2(int[] arr){
//        Assume index 0 is already a part of sort array
        for (int i = 1; i < arr.length; i++) {
                int j = i;
                while (j > 0 && arr[j] < arr[j-1]){
                    // swap arr[j], arr[j-1]
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }

        }
    }

}
