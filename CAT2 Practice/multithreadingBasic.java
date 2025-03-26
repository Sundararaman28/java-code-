class counter{
    int i=0;
    synchronized void count(){
        i++;
        System.out.println(Thread.currentThread().getName() +"added" + i);
    }
}
class mythread extends Thread{
    counter counts;
    mythread(counter count){
        counts = count;
    }
    public void run(){
        for(int i =0; i<10;i++){
            counts.count();
            try{
                sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


public class multithreadingBasic {
    public static void main(String[] args){
        counter c = new counter();

        mythread t1 = new mythread(c);
        mythread t2 = new mythread(c);

        t1.start();
        t2.start();
    }
}
