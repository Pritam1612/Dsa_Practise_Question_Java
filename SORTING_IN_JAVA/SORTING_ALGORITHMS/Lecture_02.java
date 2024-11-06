package SORTING_IN_JAVA.SORTING_ALGORITHMS;

public class Lecture_02 {
    public static void main(String[] args) {
        System.out.println("\n************* METHOD 1 ***************");
        System.out.println();
        String[] arr ={"papaya","lime","watermelon","apple","mango","kiwi"};
        System.out.print("BEFORE :: ");
        for(String i : arr){
            System.out.print(i+" , ");
        }
        System.out.print("\nAFTER :: ");
        lexicographicalSort(arr);
        for(String i : arr){
            System.out.print(i+" , ");
        }

        System.out.println();

        System.out.println("\n************* METHOD 2 ***************");
        System.out.println();
        String[] arr2 ={"papaya","lime","watermelon","apple","mango","kiwi"};
        System.out.print("BEFORE :: ");
        for(String i : arr2){
            System.out.print(i+" , ");
        }
        System.out.print("\nAFTER :: ");
        lexicographicalSort2(arr2);
        for(String i : arr2){
            System.out.print(i+" , ");
        }
    }
    public static void lexicographicalSort(String[] arr){
           for (int i = 0; i < arr.length; i++){
               for (int j = 0; j < arr.length-1; j++) {
                   if(arr[j].charAt(0) > arr[j+1].charAt(0)){
                       String temp = arr[j];
                       arr[j] = arr[j+1];
                       arr[j+1] = temp;
                   }
               }
           }
    }
    public static void lexicographicalSort2(String[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j].compareTo(arr[min_index])<0){
                    min_index =j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}
