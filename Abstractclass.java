
abstract class Parent{
    abstract void display();
}
class Child extends Parent{
    void display() {
        System.out.println("hello");
    }
}
class Child2 extends Parent{
    void display(){
        System.out.println("hi");
    }
}
public class Abstractclass {
    public static void main(String[] args) {
        Parent obj=new Child();
        Child2 obj2=new Child2();
        obj.display();
        obj2.display();
    }
}
