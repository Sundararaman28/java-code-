import java.util.Scanner;

public class charCount {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    System.out.println("Enter a string: ");
    String str = scan.nextLine();
    int count = str.length();
    System.out.println("The number of characters in the string is: " + count);
    scan.close();
      
  }
}
