import java.util.*;

class node{
    int data;
    node left = null;
    node right = null;

    node(int d){
        data = d;
    }
}
class creatingTree{
    node root = null;
    public void build(int[] arr){
        if(arr.length == 1) System.out.print(arr[0]);
        node lca = new node(arr[0]);
        root = lca;
        Queue<node> q = new LinkedList<>();
        q.add(root);
        int i=1;
        while(i<arr.length){
            node temp = q.poll();
            if(i<arr.length){
                temp.left = new node(arr[i]);
                q.add(temp.left);
                i++;
            }
            if(i<arr.length){
                temp.right = new node(arr[i]);
                q.add(temp.right);
                i++;
            }
        }
    }
    public static node lcaNode(node root, int p, int q){
        if(root == null||root.data == p||root.data == q){
            return root;
        }

        node lcaleft = lcaNode(root.left, p, q);
        node lcaright = lcaNode(root.right, p, q);

        if(lcaleft != null && lcaright != null){
            return root;
        }
        return lcaleft != null ? lcaleft : lcaright;
    }
}

public class LCAtree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = (Integer.parseInt(str[i]));
        }

        creatingTree tree = new creatingTree();
        tree.build(arr);

        int p = sc.nextInt();
        int q = sc.nextInt();

        node lca = tree.lcaNode(tree.root, p, q);
        System.out.println(lca != null ? lca.data :"not found");

        sc.close();
    }
}
