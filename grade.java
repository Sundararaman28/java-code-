import java.util.Scanner;
public class grade {
  public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);

    System.err.println("enter you mark: ");
    int mark = scanner.nextInt();
    scanner.close();

    if (mark<50) {
      System.err.println("Sorry!! your grade is F");
    }
    else if (mark>50 && mark<60) {
      System.err.println("Just miss!! your grade is D");
    }
    else if (mark > 60 && mark <70) {
      System.err.println("Average!! your grade is C");      
    }
    else if (mark>70 && mark<80) {
      System.err.println("Try better!! your grade is B");
    }
    else if (mark > 80 && mark <90) {
      System.err.println("Good try!! your grade is A");   
    }
    else if (mark > 90 && mark <100) {
      System.err.println("Wow!! your grade is S");   
    }
    else{
      System.err.println("check your mark once!! ");
    }
  }
}