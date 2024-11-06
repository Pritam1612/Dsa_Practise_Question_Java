package ARRAYSLIST_IN_JAVA;
import java.util.ArrayList;
import java.util.List;

public class Program_02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(10);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);
        list.add(1,20);
        list.add(2,5);
        list.add(0,56);
        System.out.println("REMOVE");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(list);
        list.set(2,3);
        System.out.println(list);
        System.out.println(list.contains(56));
        System.out.println(list);
        list.remove(Integer.valueOf(4)); // it remove value
        System.out.println(list.remove(Integer.valueOf(99)));
        System.out.println(list);

        ArrayList box = new ArrayList();
        box.add(1.4f);
        box.add("SANJNA");
        box.add(true);
        System.out.println(box);

    }
}
