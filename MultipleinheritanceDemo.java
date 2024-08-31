
interface Fruits {
   public void displayfruit();
}
interface Animals{
  public  void displayanimal();
}
class C implements Fruits,Animals {

    public void displayfruit() {
        System.out.println("apple");
    }

    public void displayanimal() {
        System.out.println("Cow");
    }
    public void displayhuman(){
        System.out.println("Human");
    }
}
public class MultipleinheritanceDemo {
    public static void main(String[] args) {
        C obj=new C();
        obj.displayfruit();
        obj.displayanimal();
        obj.displayhuman();

    }
}
