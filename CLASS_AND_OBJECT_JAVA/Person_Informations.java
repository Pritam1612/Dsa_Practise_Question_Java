package CLASS_AND_OBJECT_JAVA;

public class Person_Informations {


    int x ,y;

    public int sum(){
        return x +y;
    }
    public int sub(){
        return x -y;
    }
    public int mul(){

        return x * y;
    }
    public double div(){

        return x/y;
    }


    public String userName(String name){

        return name;
    }
    public int age(int age){

        return age;
    }
    public String car(String carName){

        return carName;
    }
    public double carPrice(double price){

        return price;
    }
    public double downPyament(double firstPyament){

        return firstPyament;
    }
    public double remainAmount(double price, double firstPayment){

        return price - firstPayment;
    }
}
