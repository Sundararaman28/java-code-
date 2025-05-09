import java.util.*;

public class exception1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int c = a /b;
            System.out.println("calculated");
        }catch(ArithmeticException e){
            System.out.println("the given input cannot divide, try again.");
        }finally{
            System.out.println("program executed!!");
        }
    }
}