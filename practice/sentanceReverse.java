 import java.util.*;
 public class sentanceReverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence: ");
    String str = sc.nextLine();
    String[] words = str.split(" ");
    StringBuilder reversed = new StringBuilder();

    for (int i = words.length - 1; i >= 0; i--) {
      StringBuilder word = new StringBuilder(words[i]);
      reversed.append(word.reverse()).append(" ");
    }
    System.out.println("Reversed sentence: " + reversed.toString());
  }
}
