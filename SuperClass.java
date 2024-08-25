import java.util.*;
class Cars{
    int year;
    void display(){
        System.out.println("enter the year of the car");
        Scanner sc=new  Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("the year of the car is "+a);
    }
}
class Car1 extends Cars{
    void display(){
        super.display();
    }
}
public class SuperClass {
    public static void main(String[] args){
        Car1 c=new Car1();
        c.display();
    }


}
