import java.util.*;;
public class stackBasic {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] brackets = str.toCharArray();

        int n = brackets.length;

        sc.close();
    
        Stack<Character> paranthiseStack = new Stack<>();
        for(int i=0; i<n; i++){
            if (brackets[i] == '(' || brackets[i] == '{' || brackets[i] == '[' ) {
                paranthiseStack.push(brackets[i]);
            }
            else{
                if (paranthiseStack.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }
                
                char top = paranthiseStack.peek();
                if ((top == '(' && brackets[i] == ')') ||
                    (top == '{' && brackets[i] == '}') ||
                    (top == '[' && brackets[i] == ']')) {
                    paranthiseStack.pop();
                } else {
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }
        if (paranthiseStack.empty()) {
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not balanced");
        }
    }
}

/*  //reverse the string using stack
    String str = sc.nextLine().toLowerCase();

    Stack<Character> characters = new Stack<>();

    char[] ch = str.toCharArray();

    for(int i=0; i<ch.length; i++){
        characters.push(ch[i]);
    }
    StringBuilder str1 = new StringBuilder();
    while (!characters.empty()){
        str1.append(characters.pop());
        // characters.pop);
    }       
    System.out.println(str1.toString());

    sc.close();
*/