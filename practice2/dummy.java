import java.util.Scanner;

public class dummy {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine(); // either in string or int , based in question...
    if (s.equals("input1")) {
        System.out.println("print-output1");
     
    }
    else{
        System.out.println("print-output2");
    }
    sc.close();
    }
}
