import java.util.*;
public class vowels {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    scanner.close();
    int count =0;
    for(int i =0;i<text.length();i++){
      char ch = text.charAt(i);
      if (ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch == 'o' || ch=='O' || ch=='u' || ch=='U' ) {
        count++;
      }
    }
    System.out.println(count);
  }
}