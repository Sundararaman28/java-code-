import java.util.*;

class sharedPrinter{
    synchronized void print(String name, int page){
        System.out.println(Thread.currentThread().getName() + " is printing: " + name);
        for (int i = 1; i <= page; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " printing page " + i + " of " + name);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}
class t1 extends Thread{
    int page; 
    String Name;
    sharedPrinter sh;
    t1(int t, String n, sharedPrinter sh){
        page =t;
        Name = n;
        this.sh = sh;
    }
    public void run(){
        sh.print(Name,page);
    }
}



public class threading3 {
    public static void main(String[] args) {
        sharedPrinter sh = new sharedPrinter();
        t1 t11 = new t1(3, "sun", sh);
        t1 t12 = new t1(5, "moon", sh);
        t1 t13 = new t1(2, "earth", sh);

        t11.start();
        t12.start();
        t13.start();
    }
}
