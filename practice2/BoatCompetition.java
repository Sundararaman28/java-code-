import java.util.*;

public class BoatCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] weights = new int[n];
            for (int i = 0; i < n; i++) {
                weights[i] = scanner.nextInt();
            }
            
            Arrays.sort(weights);
            int maxTeams = 0;
            
            for (int s = 2; s <= 2 * n; s++) {
                int left = 0, right = n - 1, teams = 0;
                
                while (left < right) {
                    int sum = weights[left] + weights[right];
                    if (sum == s) {
                        teams++;
                        left++;
                        right--;
                    } else if (sum < s) {
                        left++;
                    } else {
                        right--;
                    }
                }
                
                maxTeams = Math.max(maxTeams, teams);
            }
            
            result.append(maxTeams).append("\n");
        }
        
        System.out.print(result);
        scanner.close();
    }
}