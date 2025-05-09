import java.util.*;

class Thread1 extends Thread{
    int perameter;
    Thread1(int t){
        perameter = t;
    }
    public void run(){
        System.err.println("executed" + perameter);
        try{
            Thread1.sleep(2000);
        }catch(InterruptedException e){}
    }
}

public class threading1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for(int i=0; i<k; i++ ){
            Thread1 thread1 = new Thread1(i);
            thread1.start();
            try{
                thread1.join();
            }catch(InterruptedException e){}            
        }
    }
}
