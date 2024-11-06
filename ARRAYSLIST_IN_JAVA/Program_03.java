package ARRAYSLIST_IN_JAVA;

import java.util.ArrayList;
import java.util.Collections;

public class Program_03 {
    public static void main(String[] args) {
        ArrayList<Integer> box = new ArrayList<>();
        box.add(1);
        box.add(2);
        box.add(3);
        box.add(4);
        box.add(5);
        box.add(6);
        box.add(7);
        box.add(8);
        box.add(9);

        System.out.println("ORIGINAL LIST :: "+box);
        reverseArrayList(box);
        System.out.println("REVERSE LIST ::  "+box);
        Collections.reverse(box);
        System.out.println("METHOD 2 ::      "+box );
        Collections.sort(box);
        System.out.println("ASCENDING ORDER :: "+box);
        Collections.sort(box,Collections.reverseOrder());
        System.out.println("DESCENDING ORDER :: "+box);

        System.out.println("STRING ARRAY LIST");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("PRITAM");
        arrayList.add("KHUSI");
        arrayList.add("NEHA");
        arrayList.add("ANKITA");
        arrayList.add("SANJNA");
        arrayList.set(3,"ANUSHKA");
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println("SORTED LIST IS :: "+arrayList);
        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println("REVERSE ORDER IS ::"+arrayList);

    }

    public static void reverseArrayList(ArrayList<Integer> box){
        int i  = 0;
        int j = box.size() - 1;

        while (i < j){
            Integer temp = box.get(i);
            box.set(i , box.get(j));
            box.set(j , temp);
            i++;
            j--;
        }
    }

}
