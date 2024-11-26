import java.util.Arrays;
import java.util.Scanner;

public class lexicographical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a = a.toLowerCase();
        String[] str = a.split(" ");
        Arrays.sort(str,String.CASE_INSENSITIVE_ORDER);
        for(int i =0; i<str.length; i++){
            System.out.print(str[i] + " ");
        }
        sc.close();

    }
}
