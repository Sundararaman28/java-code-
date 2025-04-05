class products{
    int i = 0;
    synchronized void add(int n){
        while(n+i > 5){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        i+=n;
        notify();
        System.out.println("added and notified");
        }
    
    synchronized void remove(int n){
        while(i<n){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        i -= n;
        notify();
        System.out.println("subracted and notified");

    }
}

class my extends Thread{
    products pro;
    boolean b;
    int x;
    my(products pro, boolean b, int x){
        this.b = b;
        this.pro = pro;
        this.x = x;
    }

    public void run(){
        for(int i=0; i<10; i++){
            if(b){
                pro.add(1);
            }
            else{
                pro.remove(1);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
public class producerConsumer {
    public static void main(String[] args) {
        products pro = new products();
        my t1 = new my(pro,true,1);
        t1.start();
        
        my t2 = new my(pro,false,1);
        t2.start();
    }   
}

