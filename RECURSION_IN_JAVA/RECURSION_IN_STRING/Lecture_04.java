package RECURSION_IN_JAVA.RECURSION_IN_STRING;

public class Lecture_04 {
    public static void main(String[] args) {
        int[] arr ={10,30,40,20};
        System.out.println(stoneHeight(arr,0,arr.length));

        String s ="23";
        String[] keyBind ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//                         0  1  , 2   , 3   , 4   , 5   , 6    , 7   , 8  , 9
        keyPadCombinations(s,"",keyBind);

    }
    public static int stoneHeight(int[] arrHeight, int index , int length){
        if(index == length-1){
            return 0;
        }

        int opt1 = Math.abs(arrHeight[index] - arrHeight[index+1]) + stoneHeight(arrHeight,index+1,length);
        if(index == length-2){
            return opt1;
        }
        int opt2 = Math.abs(arrHeight[index] - arrHeight[index+2]) + stoneHeight(arrHeight,index+2,length);
        return Math.min(opt1,opt2);
    }
    public static void keyPadCombinations(String s, String currentRes, String[] keys){
        if(s.isEmpty()){
            System.out.print(currentRes+" ");
            return;
        }

        int currentNum = s.charAt(0) - '0';  // Converting char into int dataType
        String currentChoice = keys[currentNum];

        for (int i = 0; i < currentChoice.length(); i++) {
        keyPadCombinations(s.substring(1),currentRes+currentChoice.charAt(i),keys);
        }

    }

}
