package PRACTISCE_QUESTION;

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PRINTING INDICES OF THE TARGET SUM :: ");

        System.out.println("ENTER SIZE OF ARRAYS :: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("ENTER "+size+" ELEMENTS IN ARRAYS :: ");
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("YOUR ARRAY WOULD BE :: ");
        for (int i =0; i<nums.length; i++ ){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println(" ENTER A TARGET SUM :: ");
        int target = sc.nextInt();
        for(int i = 0; i <nums.length; i++){
            for(int j =  i+1; j <nums.length; j++){
                if((nums[i] + nums[j]) == target){
                    System.out.println("INDICES WOULD BE :: "+i +" , "+j);
                }
            }
        }
    }
}
