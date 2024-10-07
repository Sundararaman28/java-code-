package codevita;

import java.util.*;

public class WeaponBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading the array of weights
        String[] weightsInput = sc.nextLine().split(" ");
        int[] weights = new int[weightsInput.length];
        for (int i = 0; i < weightsInput.length; i++) {
            weights[i] = Integer.parseInt(weightsInput[i]);
        }
        
        // Reading N and K
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        // Set of triangular numbers
        Set<Integer> triangularNumbers = getTriangularNumbers(100000);
        
        int cycles = 0, consecutiveCycles = 0, lastMaxBox = -1;
        Queue<Integer> shiftedWeights = new LinkedList<>();
        
        while (consecutiveCycles < K) {
            cycles++;
            int maxBox = -1;
            for (int i = 0; i < N - 1; i++) {
                if (weights[i] < weights[i + 1]) {
                    shiftedWeights.add(weights[i]);
                    int temp = weights[i];
                    weights[i] = weights[i + 1];
                    weights[i + 1] = temp;
                }
            }
            maxBox = weights[0];
            if (maxBox == lastMaxBox) {
                consecutiveCycles++;
            } else {
                consecutiveCycles = 0;
            }
            lastMaxBox = maxBox;
        }
        
        // Calculating the amount of money for workers (sum of non-triangular shifted weights)
        int totalAmount = 0;
        for (int weight : shiftedWeights) {
            if (!triangularNumbers.contains(weight)) {
                totalAmount += weight;
            }
        }
        System.out.println(totalAmount);
        sc.close();
    }

    // Function to generate triangular numbers up to a limit
    private static Set<Integer> getTriangularNumbers(int limit) {
        Set<Integer> triangularNumbers = new HashSet<>();
        int n = 1, triangularNum = 1;
        while (triangularNum <= limit) {
            triangularNumbers.add(triangularNum);
            n++;
            triangularNum = n * (n + 1) / 2;
        }
        return triangularNumbers;
    }
}
