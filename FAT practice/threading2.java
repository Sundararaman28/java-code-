import java.util.*;

class ordering{
    int i;
    ordering(int i){
        this.i = i;
    }
    synchronized void order(int threadId){
        System.out.println("Thread-" + threadId + " is executing order for: " + i);
        try {
            Thread.sleep(1000); // Simulate some processing time
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        System.out.println("Thread-" + threadId + " finished order for: " + i);
    }

    
}


class t1 extends Thread{
    int i;
    ordering orderObj;
    t1(int i, ordering orderObj){
        this.i =i;
        this.orderObj = orderObj;
    }
    public void run(){
        orderObj.order(i);
    }
}
class t2 extends Thread{
    int i;
    ordering orderObj;
    t2(int i, ordering orderObj){
        this.i =i;
        this.orderObj = orderObj;
    }
    public void run(){
        orderObj.order(i);
    }
}
public class threading2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ordering orderObj = new ordering(0);
        for(int i = 1; i<6; i++){
            t1 t1 = new t1(i,orderObj);
            t1.start();
            t2 t2 = new t2(i,orderObj);
            t2.start();
        }





        sc.close();
    }
}


//succesful executed but not as exppected... 