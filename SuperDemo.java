//child class bata directly access garna super use garinxa

import java.util.*;
//parent class
class Employe{
    //  String name;
    int salary;
    void salaryEmployee(int m)
    {
        System.out.println("the salary is "+m);
    }
}
//child class
class Enginer extends Employe{
    int benefits=4000;
    void display()
    {
        super.salaryEmployee(10000);
        System.out.println("the benefits is "+benefits);System.out.println("the salary of the parent class is "+super.salary);
    }
}
//Driver class/main method class
public class SuperDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Enginer e=new Enginer();
      //  int n=sc.nextInt();
        //e.salaryEmployee(n);
        e.display();
    }
}

