import java.util.Scanner;

public class perfectNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("give a number : ");    
    int n = scanner.nextInt();

    scanner.close();

    int j = 0;

    for (int i =1;i<n;i++){
      if (n%i==0) {
        j+=i;
      }
      else{
        continue;
      }
    }
    System.out.println(j==n?"given number is perfect number":"its not");
  }
}
