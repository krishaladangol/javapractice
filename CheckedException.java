
import java.util.*;
public class CheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter positive number: ");
        int num = sc.nextInt();
        try {
            Validnumber(num);
            System.out.println("the number is positive i.e." + num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void Validnumber(int a) throws Exception {
        if (a < 0) {
            throw new Exception("the number is negative");
        }
    }
}

