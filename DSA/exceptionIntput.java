import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionIntput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a= sc.nextInt();
            int b = sc.nextInt();
            int result = a/b;
            System.err.println(result);
        }catch(InputMismatchException i){
            System.out.println("The given intput is not correct data type");
        }
        catch(ArithmeticException a){
            System.out.println("The numbers are invalid, cant to proceed to calculation");
        }
        finally{
            System.out.println("program completed");
        }
        sc.close();
    }
}
