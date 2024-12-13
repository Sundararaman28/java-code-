import java.util.Scanner;

public class normal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- >0) {
            String stir = sc.nextLine().toLowerCase();
            StringBuilder str2 = new StringBuilder(stir).reverse();
            String str = str2.toString();
            char[] arr = str.toCharArray();
            StringBuilder str1 = new StringBuilder();
            for(int i=0; i<arr.length; i++){
                if (arr[i] == 'p') {
                    str1.append("q");
                }
                else if (arr[i] == 'q') {
                    str1.append("p");
                }
                else if(arr[i] == 'w'){
                    str1.append("w");
                }
                else{
                    System.out.println("input error");
                }
            }
            System.out.println(str1.toString());
        }
        sc.close();
    }
    
}
