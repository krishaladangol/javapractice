
import java.util.*;
//parent class
class Employee{
  //  String name;
    int salary;
   void salaryEmployee(int m)
    {
        System.out.println("the salary is "+m);
    }
}
//child class
class Engineer extends Employee{
    int benefits=4000;
    void display()
    {
       // System.out.println(super.salary);
        System.out.println("the benefits is "+benefits);
    }
}
//Driver class/main method class
public class InheritanceDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Engineer e=new Engineer();
        int n=sc.nextInt();
        e.salaryEmployee(n);
        e.display();
    }
}
