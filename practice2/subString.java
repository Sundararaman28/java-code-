import java.util.*;
public class subString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                String substr = str.substring(i, j);
                System.out.println(substr);
            }
        }
        sc.close();
    } 
}
