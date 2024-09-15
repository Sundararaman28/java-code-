import java.util.*;
public class charOccurance {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();
    HashMap<Character, Integer> charCount = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') {
        char c = str.charAt(i);
        if (charCount.containsKey(c)) {
          charCount.put(c, charCount.get(c) + 1);
        } else {
          charCount.put(c, 1);
        }
      }
    }
    for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
      System.out.println("Character: " + entry.getKey() + ", Occurrence: " + entry.getValue());
    }
    String str1 = sc.nextLine();
    System.out.println("Enter a string: ");
    if (charCount.containsKey(str1)) {
      System.out.println("Character: " + str1 + ", Occurrence: " + charCount.get(str1));
    } else {
      System.out.println("Character: " + str1 + ", Occurrence: " + 0);
    }
    sc.close();
  }
}
