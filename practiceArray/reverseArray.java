import java.util.*;
public class reverseArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter the number how numbers in array you want to: ");
    int i = scanner.nextInt();
    int[] hello = new int[i];
    for(int j = 0; j<i; j++){
      System.out.print("enter the " + (j+1) + " digit you wnat to add : ");
      hello[j] = scanner.nextInt();
    }

    int[] olleh = new int[i];
    int z = 0;
    for (int k = hello.length-1; k>=0; k-- ){
      for (int l = z; l<=z;l++){
        olleh[l] = hello[k];
      }
      z = z+1;
    }
    System.out.println(Arrays.toString(olleh));
  }
}
