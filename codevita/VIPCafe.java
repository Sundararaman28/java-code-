package codevita;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Order {
    int index; // The index of the order in the original input
    int priority; // The priority of the order
    
    public Order(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}

public class VIPCafe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Input the number of orders
        int N = sc.nextInt();
        int[] priorities = new int[N];
        
        // Step 2: Input the priorities of each order
        for (int i = 0; i < N; i++) {
            priorities[i] = sc.nextInt();
        }
        
        // Step 3: Input the position of the friend's order
        int K = sc.nextInt() - 1; // Convert 1-based index to 0-based index
        
        // Step 4: Create a queue to hold orders with their priorities and indices
        Queue<Order> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.offer(new Order(i, priorities[i]));
        }
        
        int servedCount = 0;
        
        // Step 5: Process the queue until the friend's order is served
        while (!queue.isEmpty()) {
            // Find the highest priority in the current queue
            int maxPriority = findMaxPriority(queue);
            
            Order currentOrder = queue.poll(); // Get the first order in the queue
            
            // Check if the current order has the maximum priority
            if (currentOrder.priority == maxPriority) {
                servedCount++; // The order gets served
                if (currentOrder.index == K) {
                    // If it's the friend's order, we stop
                    System.out.println(servedCount);
                    return;
                }
            } else {
                // If not served, re-insert the order at the end of the queue
                queue.offer(currentOrder);
            }
        }
    }
    
    // Helper function to find the maximum priority in the queue
    public static int findMaxPriority(Queue<Order> queue) {
        int max = Integer.MIN_VALUE;
        for (Order order : queue) {
            if (order.priority > max) {
                max = order.priority;
            }
        }
        return max;
    }
}
