import java.util.*;

public class falsekeyBoard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        String keys = sc.next();
        char[] chkeys = keys.toCharArray();

        int tot = 0;

        for(int i=0; i<str.length; i++){
            boolean containsKey = false;
            for(int j=0; j<chkeys.length; j++){
                if(str[i].contains(String.valueOf(chkeys[j]))){
                    containsKey = true;
                    break;
                }
            }
            if (!containsKey){
                tot++;
            }
        }
        System.out.println(tot); 
        sc.close();
    }
}