import java.util.*;
public class CustomPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] str1 = a.split(" ");
        String b = sc.nextLine();
        String[] str2 = b.split(" ");
        HashMap<String,String> pari = new HashMap<>();
        boolean value = true;
        for(int i=0; i<str1.length; i++){
            if(!pari.containsKey(str1[i])){
                pari.put(str1[i],str2[i]);
            }
            else{
                if (!pari.get(str1[i]).equals(str2[i])) {
                    value = false;
                    break;
                }
            }
        }
        System.out.println(value);
        

        sc.close();
    }
}
