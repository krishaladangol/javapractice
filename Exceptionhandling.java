import java.util.Scanner;

class ExceptionHandle extends  Exceptionhandling{
    int a=10;
    int division;
    void display1(int m){
       // if(m==0)
            division=a/m;


            System.out.println("the division is "+ division);


    }

    void display(int m){
if(m==0)
            try{
//             division=a/m;

                display1(m);
            }
            catch(Exception e ){
                System.out.println("the value of "+m+" is invalid");
            }
        }
//        System.out.println("the division is "+ division);
    }

public class Exceptionhandling {
public static void main(String[] args){
    ExceptionHandle obj=new ExceptionHandle();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    obj.display(n);
    obj.display1(n);
}



}
