import java.util.Scanner;
public class fact {
  public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number to find factorial: ");
    int number = scanner.nextInt();
    int fact = 1 ;

    scanner.close();

    while (number!=0) {
      fact = fact*number;
      number -= 1;     
    }
    System.out.println("the fact of given number is "+fact);
  }
}