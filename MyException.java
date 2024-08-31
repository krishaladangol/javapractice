import java.util.Scanner;
//class RException extends RuntimeException{
//    public RException(String message){
//        super(message);
//    }
//}

public class MyException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value: ");
        int a=sc.nextInt();
        try {

          int result=10/a;
          if(a!=0){
              A(result);
          }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void A(int b) throws Exception{
        throw new Exception("The value is: "+(int)b);
    }
}
