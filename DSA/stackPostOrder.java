import java.util.*;

public class stackPostOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        operation(expression);
        sc.close();
    }
    public static void operation(String str) {
        Stack<Integer> FinalAnswer = new Stack<>();
        String[] arr = str.split(" ");
        for(int i=0; i<arr.length; i++){
            
                if (isOperator(arr[i])) {
                    try{
                        int b = FinalAnswer.pop();
                        int a = FinalAnswer.pop();
                        int result = calculate(a,b,arr[i]);
                        FinalAnswer.push(result);
                    }
                    catch (EmptyStackException e) {
                        System.out.println("Given expression is incorrect. Not enough operands.");
                    }
                }
                else{
                    FinalAnswer.push(Integer.parseInt(arr[i]));
                }
        }
        int x = FinalAnswer.pop();
        if (FinalAnswer.empty()) {
            System.out.println(x);
        }
        else{
            System.out.println("Expression has some error " + x + " This is top of the element in Stack");
        }
    }
    public static boolean isOperator(String s){
        if (s.equals("+") ||s.equals("-") ||s.equals("*") ||s.equals("/")) {
            return true;
        }
        else{
            return false;
        }
    }
    public static int calculate(int a, int b, String exp){
        switch (exp) {
            case "+":
                return a+b;
                
            case "-":
                
                return a-b;
            case "*":
                
                return a*b;
            case "/":
                
                return a/b;
        
            default:
                throw new IllegalArgumentException("Invalid operator");
                
        }
    }
}
