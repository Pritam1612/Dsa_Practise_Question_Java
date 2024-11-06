package SORTING_IN_JAVA.SORTING_ALGORITHMS;

public class Merge_Sort {
    public static void main(String[] args) {

        System.out.println("************** METHOD 1 ****************");
        int[] arr = {4,7,20,2,8,11};
        System.out.print("BEFORE :: ");
        for (int i : arr)
        {
            System.out.print(i+" ");
        }
        System.out.print("\nAFTER :: ");
         mergeSort(arr,0,arr.length-1);
        for (int i : arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void merge(int[] arr, int left , int mid , int right){
                int n1 = mid - left +1;
                int n2 = right - mid;
                int[] leftArray = new int[n1];
                int[]  rightArray = new int[n2];
                int i , j ,k;

                for ( i = 0; i < n1; i++) {
                    leftArray[i] = arr[left+i];
                }
                for (j = 0; j < n2; j++) {
                    rightArray[j] = arr[mid+j+1];
                }

        i = 0 ;
        j = 0 ;
        k = left;
        while (i < n1 && j < n2)
        {
            if(leftArray[i] <= rightArray[j])
            {
                arr[k++] = leftArray[i++];
            }
            else
            {
                arr[k++] = rightArray[j++];
            }
        }
        while (i < n1)
        {
            arr[k++] = leftArray[i++];
        }
        while (j < n2)
        {
            arr[k++] = rightArray[j++];
        }
    }
    public static void mergeSort(int[] arr , int left , int right){
        if(left >= right){
            return;
        }
        int midPoint = (left+right)/2;
        mergeSort(arr , left ,midPoint);
        mergeSort(arr,midPoint+1,right);

        merge(arr , left , midPoint , right);

    }
}
