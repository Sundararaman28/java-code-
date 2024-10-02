import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class vowels {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String str = scanner.nextLine();
      str = str.replaceAll("[^a-zA-Z]", "");
      str = str.toLowerCase();

      Pattern pattern = Pattern.compile("[aeiou]");
      Matcher matcher = pattern.matcher(str);

      System.out.println("found vowels are:");
      while (matcher.find()) {
        System.out.println(matcher.group());
      }

    }
  }
        