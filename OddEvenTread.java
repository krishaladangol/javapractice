
class Oddthread extends Thread{
   public void run()
    {
        for(int i=0;i<10;i++){
            if(i%2==1)
            {
                try{
                    Thread .sleep (1000);
                }
                catch(InterruptedException e){
                    System.out.println("error");

                }

                System.out.println(i);
            }
        }
    }
}
class EvenThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            if(i%2==0){
                try{
                    Thread .sleep (1000);
                }
                catch(InterruptedException e){
                    System.out.println("error");

                }
                System.out.println(i);
            }
        }
    }
}
public class OddEvenTread{
    public static void main(String[] args){
        Oddthread obj=new Oddthread();
        EvenThread obj1=new EvenThread();
        obj.start();
        obj1.start();
    }
}
