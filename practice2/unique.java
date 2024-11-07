import java.util.*;

public class unique {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();
    HashSet<Character> unique = new HashSet<>();
    for (int i =0; i<a ; i++){
      char ch = str.charAt(i);
      if (!unique.contains(ch)) {
        unique.add(ch);
      }
    }
    System.out.println(unique.size());
    sc.close();
  }
}