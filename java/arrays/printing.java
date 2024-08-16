package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class printing {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
//print array through loop
    for (int i =0; i < array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.err.println("");
    System.out.println("enter the index to find the specific element: ");
    int numberIndex = scanner.nextInt();
    scanner.close();

//printing specific element in array
    if (numberIndex < array.length) {
      System.out.println(array[numberIndex]);
    }
    else{
      System.out.println("enter proper index number!!");
    }

// updating an element in array;
    array[2] = 2;
    System.out.println(Arrays.toString(array));
  }
}
