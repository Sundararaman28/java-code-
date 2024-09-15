import java.util.*;
public class plaindromeString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    scanner.close();

    text = text.toLowerCase();
    text = text.trim();
    StringBuilder result = new StringBuilder();
    for(int i = text.length()-1;i>=0;i--){
      result.append(text.charAt(i));
    }
    
    if (result.toString().equals(text)) {
      System.out.println(true);
    }
    else{
      System.out.println(false);
    }
  }
}
