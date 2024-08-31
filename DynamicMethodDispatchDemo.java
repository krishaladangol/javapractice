//DMD==parent ko reference le child ko obj create garne
abstract class Kist{
    abstract void display();
}
class Bit extends Kist{
     void display(){
         System.out.println("Batch 2022");
    }
}
class BBA extends Kist{
    void display(){
        System.out.println("Batch 2020");
    }

}
public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {
        Kist obj=new Bit();
        obj.display();
        Kist obj2=new BBA();
        obj2.display();
    }

}
