import java.util.*;
class booking{
    int d;
    booking(int data){
        d= data;
    }
    synchronized void book(int tk){
        while(d<tk){
            try {
                System.out.println("waiting tickets to cancellation");
                wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        d -= tk; 
        System.out.println("ticket booked, Reamaining: " + d );
    }
    synchronized void cancel(int c){
        d += c;
        System.out.println("ticket cancelled!! Available ticket" + d);
        notify();
    }
}
class thread extends Thread{
    booking bk;
    int d; 
    boolean st;
    thread(booking bk,int data,boolean cl){
        this.bk = bk;
        d = data;
        st = cl;
    }
    public void run(){
        if(st){
            bk.book(d);
        }
        else{
            bk.cancel(d);
        }
    }
}

public class ticketBookingSystem
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tkCount = sc.nextInt();
		int tkBook = sc.nextInt();
		int tkCancel = sc.nextInt();
		System.out.println("Initially available tickets" + tkCount);
		booking bk = new booking(tkCount);
		thread t1 = new thread(bk,tkBook,true);
		thread t2 = new thread(bk,tkCancel,false);
		
		t1.start();
		t2.start();
		sc.close();
	}
}