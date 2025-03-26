import java.util.Arrays;

public class greatestRight {
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] arr1 = new int[n];
        
        // Start at the first index
        int currentIndex = 0;

        while (currentIndex < n - 1) {
            int[] values = greatest(arr, currentIndex);

            // Fill the array with the max value until the next update
            for (int i = currentIndex; i < values[1]; i++) {
                arr1[i] = values[0];
            }

            currentIndex = values[1]; // Move to the next index where max was found
        }

        arr1[n - 1] = -1; // Last element is always -1
        return arr1;
    }

    // Function to find the greatest element in the right and its index
    public static int[] greatest(int[] arr, int index) {
        int max = Integer.MIN_VALUE;
        int maxIndex = index + 1;

        // Find the max in the right side
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        return new int[]{max, maxIndex};
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] newarr = replaceElements(arr);
        System.out.println(Arrays.toString(newarr)); // [18, 6, 6, 6, 1, -1]
    }
}
