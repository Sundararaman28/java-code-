import java.util.Scanner;
public class evenOdd {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.err.println("enter a number: ");
    int number = scanner.nextInt();

    if (number%2 == 0){
      System.err.println("given number is even");
    }
    else{
      System.err.println("given number is odd");
    }

  }
}
