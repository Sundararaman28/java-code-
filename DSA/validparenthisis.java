import java.util.*;

public class validparenthisis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isValid(s));

    }
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                if(ch == ')' && stack.peek() != '(') {
                    return false;
                }
                if(ch == '}' && stack.peek() != '{') {
                    return false;
                }
                if(ch == ']' && stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty(); 
        
    }
}
