import java.util.Scanner;
public class leapYear {
  public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);
    System.out.print("enter a year to check its leap year or not: ");
    int year = scanner.nextInt();
    scanner.close();

    int result = year%4;
    if (result ==0) {
      System.out.println("the given year is leap Year!!");      
    }
    else{
      System.out.println("the given year is not Leap year!!");
    }
    
  }
}
