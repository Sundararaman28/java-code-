import java.util.*;

public class stackSorting {
    public static void sorting(int[] arr){
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        for(int i=0; i<arr.length; i++){
            if (!stk.empty()) {
                if (stk.peek()>arr[i]) {
                    stk.push(arr[i]);
                }
                else{
                    boolean status = false;
                    while (!status) {
                        temp.push(stk.pop());
                        if (stk.empty() || stk.peek()>arr[i]){
                            stk.push(arr[i]);
                            while (!temp.empty()) {
                                stk.push(temp.pop());
                            }
                            status = true;
                        }
                    }
                }
            }
            else{
                stk.push(arr[i]);
            }
        }
        System.out.println(stk);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i=0; i<l; i++){
            arr[i] = sc.nextInt();
        }
        sorting(arr);
        sc.close();
    }
}
