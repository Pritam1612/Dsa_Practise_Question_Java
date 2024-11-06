package SORTING_IN_JAVA.SORTING_ALGORITHMS;

public class Quick_Sort {
    public static void main(String[] args) {
        System.out.println("************** METHOD 1 ****************");
        int[] arr = {6,6,3,1,5,5,4,5,11};
        System.out.print("BEFORE :: ");
        for (int i : arr)
        {
            System.out.print(i+" ");
        }
        System.out.print("\nAFTER :: ");
        quickSort(arr,0,arr.length-1);
        for (int i : arr)
        {
            System.out.print(i+" ");
        }

    }
    public static void swap(int[] arr, int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static int partition(int[] arr , int start , int end){
        int pivot = arr[start];
        int count = 0;
        for (int i = start+1; i <=end ; i++) {
            if(arr[i] <=pivot){
                count++;
            }
        }
        int pivotIndex = start + count;
        swap(arr,start,pivotIndex);

        int i =start, j = end;
        while (i < pivotIndex && j > pivotIndex){
            while (arr[i] <= pivot){
                i++;
            }
            while (arr[j] > pivotIndex){
                j--;
            }
            if(i < pivotIndex && j >pivotIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int[] arr , int start , int end){
        if(start >= end){
            return;
        }
        int partitionIndex = partition(arr,start,end);
        quickSort(arr,start,partitionIndex-1);
        quickSort(arr,partitionIndex+1,end);
        
    }
}
