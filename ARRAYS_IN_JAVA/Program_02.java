package ARRAYS_IN_JAVA;

public class Program_02 {
    public static void main(String[] args) {
        int [] arr ={5,3,6,2,8,4,10,8};
        int ans =0;

//        for (int i =0; i < arr.length; i++){
//            if(ans < arr[i]){
//                ans = arr[i];
//            }
//        }

        for (int j : arr) {
            if (ans < j) {
                ans = j;
            }
        }
        System.out.println("MAX VALUE IN ARRAY IS "+ans);

        int value =8;
        ans =-1; //if array out of rang it gives index -1
        for (int i =0; i < arr.length; i++){
            if(arr[i] == value){
              ans =i;
              break;
            }
        }
        System.out.println("FOUND "+value+" AT INDEX "+ans);
    }


}
