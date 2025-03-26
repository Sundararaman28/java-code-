
import java.util.*;

public class firstNonRepeatchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        operation(arr);
        sc.close();
    }
    public static void operation(char[] arr){
        HashMap<Character,Integer> fre = new HashMap<>();
        Queue<Character> str = new LinkedList<>();

        for(char c : arr){
            str.add(c);
            fre.put(c, fre.getOrDefault(c, 0) + 1);
            
            while(!str.isEmpty() && fre.get(str.peek()) >1){
                str.poll();
            }
            if(!str.isEmpty()) {
                System.out.print(str.peek()+" ");
            }
            else{
                System.out.print("# ");
            }
        }
    }
}
