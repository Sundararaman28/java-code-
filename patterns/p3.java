package patterns;
import java.util.Scanner;

public class p3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();

    
    for (int i =1; i<n; i++){
      for (int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      
      for (int k=1;k<=i;k++){
        System.out.print(i);
        
      }
      
      System.out.println("");
      
    }
  }
  
}