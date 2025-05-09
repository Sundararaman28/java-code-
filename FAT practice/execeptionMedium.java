import java.util.*;

public class execeptionMedium {
    public static class InsufficientBalance extends Exception{
        public InsufficientBalance(String msg){
            super(msg);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        sc.close();
        try{
            if(a < b){
                throw new InsufficientBalance("insufficient balance for your account");
            }
            else{
                int c = a - b;
                System.out.println("the withdreew success!, remaining " + c);
            }
        }catch(InsufficientBalance e){
            System.out.println(e.getMessage());
        }
    }
}


