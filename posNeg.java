import java.util.Scanner;
public class posNeg {
  public static void main(String[]args){
    Scanner scanner =new Scanner(System.in);

    System.err.println("enter a number to check positive or negative: ");
    int number = scanner.nextInt();

    scanner.close();

    if (number<0) {
      System.err.println("the given number is negative!!");      
    }
    else{
      System.err.println("the given number is postive!!");
    }

  }
}