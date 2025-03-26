import java.util.*;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
class buldingLinkedList{
    Node head;
    void insert(int d){
        Node newnode = new Node(d);
        if(head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
    void delete(int d){
        if(head == null) return;
        if(head.data == d) {
            head = head.next;
            return;
        }
        Node temp = head;
        Node prev = null;
        while(temp.next != null &&temp.data!=d){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null) return;
        prev.next = temp.next;
    }
    boolean search(int d ){
        if(head == null) return false;
        if(head.data == d){
            return true;
        }
        Node temp = head.next;
        while(temp != null){
            if(temp.data == d) return true;
            temp = temp.next;
        }
        return false;
    }
    List<Integer> display(){
        List<Integer> list = new ArrayList<>();
        if(head == null) return list;

        Node temp = head;
        while (temp.next != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        return list;
    }
}

public class traininglinkedlist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        buldingLinkedList linkedlist = new buldingLinkedList();
        for(int i =1; i<10; i++){

            linkedlist.insert(i);
        }
        linkedlist.search(5);
        linkedlist.search(11);
        linkedlist.delete(5);
        System.out.println(linkedlist.display());
        sc.close();
    }
    
}

        
        /*int a = sc.nextInt();
        for(int i=0; i<a; i++){
            list.add(sc.nextInt());
        }
        list.add(2,    25);
        list.removeFirst();
        System.out.println(list.size());
        System.out.println(list.contains(40));
        System.out.println(list);*/
