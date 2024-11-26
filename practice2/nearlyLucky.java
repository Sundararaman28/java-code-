import java.util.*;

public class nearlyLucky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String n = scanner.next();
        
        int luckyDigitsCount = 0;
        
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '4' || n.charAt(i) == '7') {
                luckyDigitsCount++;
            }
        }
        
        if (luckyDigitsCount == 4 || luckyDigitsCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
