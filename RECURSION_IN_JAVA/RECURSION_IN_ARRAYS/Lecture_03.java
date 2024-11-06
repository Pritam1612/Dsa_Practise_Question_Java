package RECURSION_IN_JAVA.RECURSION_IN_ARRAYS;

import java.util.ArrayList;

public class Lecture_03 {
    static ArrayList<Integer> allIndices(int[] array, int index, int target){

        ArrayList<Integer> ans = new ArrayList<>();
        if(index >= array.length){
            return ans; //Empty arraylist
        }

        if(array[index] == target){
            ans.add(index);
        }
        ArrayList<Integer> smallAnswer = allIndices(array,index + 1, target);
        ans.addAll(smallAnswer);
        return ans;
    }
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,4,4,3,5,9};
        ArrayList<Integer> list = allIndices(myArray , 0 , 4);
        System.out.print("FOUND AT INDEXES :: ");
        for(int i :list){
            System.out.print(i+" ");
        }
    }
}
