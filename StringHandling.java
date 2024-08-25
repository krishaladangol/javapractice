import java.util.*;
public class StringHandling {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string: ");
       String name=sc.nextLine();
       int m=name.length();
       String[] a=name.split(" ");
        System.out.println("The length of the string is ");
        System.out.println(m);
        System.out.println("the uppercase value is ");
        System.out.println(name.toUpperCase());
        System.out.println("the lowercase value is ");
        System.out.println(name.toLowerCase());
        System.out.println("the string after split is: ");
        System.out.println(Arrays.toString(a));
        System.out.println("the string after trim is: ");
        System.out.println(name.trim());
        System.out.println("the string after substring: ");
        System.out.println(name.substring(1,5));
    }
}
