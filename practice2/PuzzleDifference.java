import java.util.Arrays;
import java.util.Scanner;

public class PuzzleDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] pieces = new int[m];

        for (int i = 0; i < m; i++) {
            pieces[i] = scanner.nextInt();
        }

        Arrays.sort(pieces);

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i <= m - n; i++) {
            int difference = pieces[i + n - 1] - pieces[i];
            minDifference = Math.min(minDifference, difference);
        }

        System.out.println(minDifference);

        scanner.close();
    }
}
