import java.util.*;

public class queueStackReversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> numbers = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> reversed = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            numbers.offer(sc.nextInt());
        }
        while(!numbers.isEmpty()){
            stack.push(numbers.poll());
        }
        while(!stack.isEmpty()){
            reversed.offer(stack.pop());
        }
        System.out.println(reversed);
        sc.close();
    }
}
