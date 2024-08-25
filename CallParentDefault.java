class Parent{
    int age;
    String name;
    Boolean married;
//    Parent(int age,String name,Boolean married){
//        this.age=age;
//        this.name=name;
//        this.married=married;
//
//    }
    void display(){
        System.out.println("age="+age);
        System.out.println("name="+name);
        System.out.println("married="+married);
    }
}
class Child extends Parent{
   Child(int age,String name,Boolean married) {
       this.age=age;
       this.name=name;
       this.married=married;
   }
    }
public class CallParentDefault {
    public static void main(String[] args) {
      Child obj=new Child(21,"sakina",false);
      obj.display();
    }
}
