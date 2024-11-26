import java.util.Scanner;

public class MaxAbsoluteDifferenceSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();
            
            if (n == 1) {
                result.append(0).append("\n");
            } else if (n == 2) {
                result.append(m).append("\n");
            } else {
                result.append(2 * m).append("\n");
            }
        }
        
        System.out.print(result);
        scanner.close();
    }
}