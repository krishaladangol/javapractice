class Fruit{
    void displayFruit(){
        System.out.println("Apple");
    }
}
class Animal extends Fruit{
    void displayAnimal(){
        System.out.println("Cow eats apple");
    }
}
class Human extends Animal{
    void displayHuman(){
        System.out.println("Human also eats apple");
    }
}
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.displayFruit();
        obj.displayAnimal();
        obj.displayHuman();
    }
}
