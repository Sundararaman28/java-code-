import java.util.*;

public class BalancedCyclicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        for (int testCase = 0; testCase < t; testCase++) {
            int n = sc.nextInt();  
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();  
            }

            long sum = 0;
            for (int num : a) {
                sum += num;
            }

            // If the sum is not divisible by n, it's impossible to balance
            if (sum % n != 0) {
                System.out.println(-1);
                continue;
            }

            // Calculate the target value for each element
            long target = sum / n;
            long[] operations = new long[n];
            
            // Greedily apply operations to balance the array
            for (int i = 0; i < n; i++) {
                long diff = a[i] - target;
                if (diff != 0) {
                    // Apply operations at i to make a[i] = target
                    operations[i] += Math.abs(diff);
                    a[i] -= diff;
                    a[(i + 1) % n] += 2 * diff;
                    a[(i - 1 + n) % n] += diff;
                }
            }

            // After the operations, check if the array is balanced
            boolean balanced = true;
            for (int i = 0; i < n; i++) {
                if (a[i] != target) {
                    balanced = false;
                    break;
                }
            }

            if (balanced) {
                // Output the result
                for (long op : operations) {
                    System.out.print(op + " ");
                }
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
