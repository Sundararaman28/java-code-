package patterns;

import java.util.Scanner;

public class sample1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("enter a number: ");
    int n = scanner.nextInt();

    scanner.close();


    for (int i =1; i<=n; i++){
      for (int j =1; j<=i;j++){
        System.out.print("*");
      }
      System.out.println("");

    }
  }
}
