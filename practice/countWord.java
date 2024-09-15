import java.util.Scanner;

public class countWord {
  public static void main(String[] args) {
        int count = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
              if (str.charAt(i) == ' ') {
                  count++;
              }
          }
          System.out.println("Number of words in a sentence: " + (count +1));
        sc.close();
    }
}
