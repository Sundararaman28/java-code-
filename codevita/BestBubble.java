package codevita;

import java.util.Scanner;

public class BestBubble {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        // Counting swaps for ascending and descending order
        int ascendingSwaps = countSwaps(arr.clone(), true);
        int descendingSwaps = countSwaps(arr.clone(), false);

        // Output the minimum of the two
        System.out.println(Math.min(ascendingSwaps, descendingSwaps));
    }

    // Function to count the number of swaps using bubble sort
    private static int countSwaps(int[] arr, boolean ascending) {
        int n = arr.length;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare for ascending or descending order
                if ((ascending && arr[j] > arr[j + 1]) || (!ascending && arr[j] < arr[j + 1])) {
                    // Swap and count the swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                }
            }
        }

        return swapCount;
    }
}
