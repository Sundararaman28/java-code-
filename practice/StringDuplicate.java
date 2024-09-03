import java.util.*;
public class StringDuplicate {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String text = scanner.nextLine();
    text= text.toLowerCase();
    
    scanner.close();

    String result = "";

    for (int i = 0; i<text.length();i++){
      char curent = text.charAt(i);

      String currentChar = Character.toString(curent);

      if (result.contains(currentChar)) {
        result += currentChar;
      }
    }
    System.out.println(result);
  }
}
