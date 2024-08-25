class Car {
    int year;
   // string color;
    boolean electric;

    void start() {
        System.out.println("statring");
    }

    Car(int year,  boolean electric) {
        this.year = year;

       this. electric = electric;
    }

    void display()
    {
        System.out.println(year);

        System.out.println(electric);

    }
}


public class Practice {
    public static void main(String[] args){
        Car car=new Car(1,false);
        car.start();
        car.display();
    }
}
