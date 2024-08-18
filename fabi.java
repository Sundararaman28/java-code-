import java.util.Scanner;
public class fabi {
  public static void main(String[]args){
    int a = 0;
    int b = 1;
    int c;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    scanner.close();

    for (int i = number; i!=0; i--){
      System.out.print(a + ", ");
      c = a+b;
      a=b;
      b=c;
    }
  }
}