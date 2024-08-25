

class Motor
{
    int model;
    int year;
    String color;
    Motor(int a,int b,String c){
        model=a;
        year=b;
        color=c;
    }
    void display(){
        System.out.println("the model is: "+model);
        System.out.println("the year is : "+year);
        System.out.println("the color is :"+color);
    }
}
class Tesla extends Motor{
    Tesla(int a, int b, String c) {

        super(a, b, c);
    }

//    void display1(){
//       super.display();
//    }
}
public class Cara{
    public static void main(String[] args) {
        Tesla obj=new Tesla(12,2012,"red");
obj.display();
       // obj.display1();
}

}
