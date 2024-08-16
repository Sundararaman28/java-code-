import java.util.Scanner;
public class amstrong {
  public static void main(String[]args){

    System.out.println("enter a number to check it is amstrong ot not: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    scanner.close();

    int originalNumber = number;

    int digits = String.valueOf(number).length();
    System.err.println(digits);
    int sum =0;

    while (number>0){
      int number1  = number % 10;
      sum += (int)Math.pow(number1,digits);
      number /= 10;
    }

    if (sum == originalNumber){
      System.err.println("given nunmber is amstrong");
    }
    else{
      System.err.println("given number is not amstrong number: ");
    }

  }
}