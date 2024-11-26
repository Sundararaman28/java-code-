import java.util.*;

public class RegularBrackerSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < testCases; i++) {
            String str = sc.nextLine();
            int count = 0;
            for (int start = 0; start < str.length(); start++) {
                for (int end = start; end < str.length(); end++) {
                    String substring = str.substring(start, end + 1);
                    String inversedSubstring = inverse(substring);
                    String result = str.substring(0, start) + inversedSubstring + str.substring(end + 1);
                    if (isRegularBracketSequence(result)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }

    public static String inverse(String substr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < substr.length(); i++) {
            char ch = substr.charAt(i);
            sb.append(ch == '(' ? ')' : '(');
        }
        return sb.toString();
    }

    public static boolean isRegularBracketSequence(String value) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}