package patterns;
import java.util.Scanner;

public class p5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   int n = scanner.nextInt();
   scanner.close();

   for (int i =1;i<=n;i++){
    for(int j=1; j<=n; j++){
      if (i==1 || i==5 || j==1||j==5) {
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