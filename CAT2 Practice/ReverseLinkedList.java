import java.util.*;

class node{
    int data;
    node next;
    node(int d){
        data = d;
        next = null;
    }
}
class buildingList{
    node head = null;
    node create(int[] arr){
        if(arr.length == 0) return null;
        if(head == null){
            head = new node(arr[0]); 
        } 
        node temp = head;
        
        for (int i = 1; i < arr.length; i++) {
            temp.next = new node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    void print(){
        if(head == null) return;
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    node reverse(){
        if(head == null){
            return null;
        }
        node temp = head;
        node prev = null;
        while(temp != null){
            node nextnode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextnode;
        }
        head = prev;
        return head;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        buildingList list = new buildingList();
        list.create(arr);
        list.print();
        sc.close();
    }
}
