import java.util.*;

public class nextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] scores = new int[n];
        
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        
        int scoreThreshold = scores[k - 1];
        int count = 0;
        
        for (int score : scores) {
            if (score >= scoreThreshold && score > 0) {
                count++;
            }
        }
        
        System.out.println(count);
        scanner.close();
    }
}
