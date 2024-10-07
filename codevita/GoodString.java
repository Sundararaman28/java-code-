package codevita;
import java.util.*;

public class GoodString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading the good string and name
        String goodString = sc.nextLine();
        String name = sc.nextLine();
        sc.close();

        // Convert the good string into a character array
        char[] goodLetters = goodString.toCharArray();
        
        // Initialize previous good letter as the first character in the good string
        char previousGoodLetter = goodLetters[0];
        
        // Variable to store the total distance
        int totalDistance = 0;

        // Process each character in the name
        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            
            // If the character is already in the good string, no need to change it
            if (goodString.indexOf(currentChar) != -1) {
                previousGoodLetter = currentChar; // Update the previous good letter
                continue;
            }

            // Find the nearest good letter
            int minDistance = Integer.MAX_VALUE;
            char closestGoodLetter = previousGoodLetter;

            for (char goodChar : goodLetters) {
                int currentDistance = Math.abs(currentChar - goodChar);
                
                // If this good letter is closer, update the closest good letter
                if (currentDistance < minDistance) {
                    minDistance = currentDistance;
                    closestGoodLetter = goodChar;
                }
                // If equidistant, choose the letter closest to previous good letter
                else if (currentDistance == minDistance) {
                    if (Math.abs(previousGoodLetter - goodChar) < Math.abs(previousGoodLetter - closestGoodLetter)) {
                        closestGoodLetter = goodChar;
                    }
                }
            }

            // Add the minimum distance to the total
            totalDistance += Math.abs(currentChar - closestGoodLetter);
            
            // Update the previous good letter
            previousGoodLetter = closestGoodLetter;
        }

        // Output the total distance
        System.out.println(totalDistance);
    }
}
