import java.util.*;
public class largestElement{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter the number how numbers in array you want to: ");
    int i = scanner.nextInt();
    int[] hello = new int[i];
    for(int j = 0; j<i; j++){
      System.out.print("enter the " + (j+1) + " digit you wnat to add : ");
      hello[j] = scanner.nextInt();
    }
    int max = hello[0];
    for(int k = 1; k<hello.length; k++){
      if (hello[k] > max) {
        max = hello[k];
      }
    }
    System.out.println("the maximum in an arary is: " + max);
    scanner.close();
  }             
}