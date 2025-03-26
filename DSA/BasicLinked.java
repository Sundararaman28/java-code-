import java.util.*;

class node{
    int data;
    node next;
    
    node(int d){
        this.data = d;
        this.next = null; 
    }
}
public class BasicLinked{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] elements = sc.nextLine().split(" ");
        int[] arr = Arrays.stream(elements).mapToInt(Integer::parseInt).toArray();
        node head = null;
        node temp = null;
        for(int i=0; i<arr.length; i++){
            if(head == null) {
                head = new node(arr[i]);
                temp = head;
            }
            else{
                temp.next = new node(arr[i]);
                temp = temp.next;
            }
        }
        node temp1 = head;
        while (temp1 != null) {
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }
        System.out.println();
    sc.close();
    }
}