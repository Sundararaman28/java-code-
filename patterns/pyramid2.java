package patterns;

import java.util.Scanner;

public class pyramid2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    scanner.close();

    for( int i = 0; i<=a; i++){
      for (int j=0;j<+a-i;j++){
        System.out.print(" ");
      }
      for (int k =0;k<2*i-1;k++){
        if (k%2!=0) {
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
        
      }
      System.out.println("");
    }

  }
  
}
