import java.util.*;
public class eassy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int num = sc.nextInt();
            int count = 0;
            for(int b=1; b<=num; b++){
                int a = num-b;
                if (a>0) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
    
}
