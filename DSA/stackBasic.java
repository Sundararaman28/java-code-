import java.util.*;;
public class stackBasic {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
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

    }
}