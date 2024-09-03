import java.util.*;
public class plaindromeString {
  public static void main(String[] args) {
    Scanner sca = new Scanner(System.in);
    String text = sca.nextLine();

    sca.close();
    String reverseText= "";
    for(int i=text.length()-1;i>=0;i--){
      reverseText += text.charAt(i);
    }
    if (reverseText.equals(text)) {
      System.out.println("yes it is plaindrome text/String...");
    }
    else{
      System.out.println("the given string is not palindrome.. ");
    }

  }
}
