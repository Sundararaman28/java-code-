package litcode;
import java.util.*;

public class pin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String intInput = sc.nextLine();

    StringBuilder result = new StringBuilder();

    String[] array1 = intInput.split(" ");

    sc.close();

    for (String i : array1){
      int j = Integer.parseInt(i);
      int Csum = csum(j);
      result.append(numtoapha(Csum));
    }
    System.out.println(result);
  }
  public static int csum(int num) {
    while (num>9) {
      int k = 0;
      while(num>0){
         k += num%10;
         num = num /10;
      }
      num = k;
    }
    return num;
  }
  public static String numtoapha(int i){
    String[] alphas = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
    if (i % 2 ==0) {
      return String.valueOf(i);
    }
    else{
      return alphas[i-1];
    }
  }  
}
