package CLASS_AND_OBJECT_JAVA;

public class Person {
    int age = 18;
    String name = "Rohan";

    public int getage(int age_1){
        return age_1;
    }

    public static void main(String[] args) {
//        Creating object of person class
        Person person = new Person();
        System.out.println("NAME OF THE PERSON IS "+person.name);
        System.out.println("AGE OF THE PERSON "+person.name + "IS :: "+person.age);
    }
}
