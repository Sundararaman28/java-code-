package codevita;
import java.util.*;

public class Orchard {

    // Method to check if the input is valid
    public static boolean isValid(String s) {
        for (char c : s.toCharArray()) {
            if (c != 'M' && c != 'L') {
                return false; // Invalid input if the character is not M or L
            }
        }
        return true;
    }

    // Method to calculate possible sets of 3 trees that are non-adjacent
    public static int calculatePossibilities(String row) {
        int n = row.length();
        if (n < 3) return 0; // If there are fewer than 3 trees, no possibilities

        int possibilities = 0;

        // Iterate through all combinations of i, j, k where i < j < k
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (row.charAt(i) != row.charAt(j)) { // Check for non-adjacent type
                    for (int k = j + 1; k < n; k++) {
                        if (row.charAt(j) != row.charAt(k) && row.charAt(i) != row.charAt(k)) {
                            possibilities++;
                        }
                    }
                }
            }
        }

        return possibilities;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for Ashok and Anand
        String ashokRow = sc.nextLine();
        String anandRow = sc.nextLine();
        sc.close();

        // Validate inputs
        if (!isValid(ashokRow) || !isValid(anandRow)) {
            System.out.println("Invalid input");
            return;
        }

        // Calculate possibilities for both rows
        int ashokPossibilities = calculatePossibilities(ashokRow);
        int anandPossibilities = calculatePossibilities(anandRow);

        // Determine the result based on the number of possibilities
        if (ashokPossibilities > anandPossibilities) {
            System.out.println("Ashok");
        } else if (anandPossibilities > ashokPossibilities) {
            System.out.println("Anand");
        } else {
            System.out.println("Draw");
        }
    }
}
