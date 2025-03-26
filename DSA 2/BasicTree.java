import java.util.*;

class node{
    int data;
    node left = null;
    node right = null;

    node(int d){
        this.data = d;
    }
}
class Buildtree{
    node root = null;
    
    public void create(int[] arr){
        if(arr.length == 0) return;
        
        root = new node(arr[0]);
        Queue<node> que = new LinkedList<>();
        que.add(root);
        
        int i=1;
        while(i < arr.length){
            node temp = que.poll();
            if(i<arr.length){
                temp.left = new node(arr[i++]);
                que.add(temp.left);
            }
            if(i<arr.length){
                temp.right = new node(arr[i++]);
                que.add(temp.right);
            }
        }
    }
    public void printing(){
        if(root == null) return;
        
        Queue<node> que = new LinkedList<>();
        que.add(root);
        
        while(!que.isEmpty()){
            node temp = que.poll();
            System.out.print(temp.data + " ");
            
            if(temp.left != null) que.add(temp.left);
            if(temp.right != null) que.add(temp.right);
        }
    }
    
}
public class BasicTree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        
        Buildtree newn = new Buildtree();
        newn.create(arr);
        newn.printing();

        sc.close();
 
    }
}
