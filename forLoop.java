import java.util.Scanner;

public class forLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a = scanner.nextInt();
    scanner.close();

    for(int i = a; i!=0; i--){
      if (i%5==0) {
        continue;
      }
      else if (i == 11) {
        System.out.println("hello hi bye!!!!");
        return;
      }
      else{
      System.out.println(i);
      }
    }
  }
}