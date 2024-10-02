
import java.util.regex.*;

public class PaaternAndMatcher {
  public static void main(String[] args) {
    Pattern p = Pattern.compile(".x");
    Matcher m = p.matcher("ax");
    boolean b = m.matches();
    System.out.println(b);
    boolean b2 = Pattern.matches(".x", "ax");
   System.out.println(b2); 
  }
}
