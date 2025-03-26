import java.util.*;


class node{
    int data; 
    node next;
    node(int d){
        data = d;
        next = null;
    }
}
class BuuildLinkedList{
    node head = null;
    void add(int d){
        if(head == null) {
            head = new node(d);
            return;
        }
        node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new node(d);
    }
    void removeduplicates(){
        List<Integer> uni = new LinkedList<>();
        node temp = head;
        node prev = null;
        while(temp != null){
            if(!uni.contains(temp.data)){
                uni.add(temp.data);
                prev = temp;
                temp = temp.next;
            }
            else{
                prev.next = temp.next;
                temp = temp.next;
            }
        }
    }
    List<Integer> display(){
        List<Integer> list = new ArrayList<>();

        if(head == null){
            return list;
        }
        node temp = head;

        while(temp != null){
            list.add(temp.data);
            temp = temp.next;
        }
        return list;
    }


}

public class RemovieDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BuuildLinkedList blist = new BuuildLinkedList();

        int a  = sc.nextInt();
        for(int i=1; i<=a; i++){
            if(i%2==0){
                blist.add(i);
                blist.add(i);
            }
            else{
                blist.add(i);
            }
        }
        
        System.out.println(blist.display());

        blist.removeduplicates();
        System.out.println(blist.display());

    }
}
