import java.util.*;

public class uniqueCharacters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chArray = s.toCharArray();
        int result = removing(chArray);
        System.out.println(result);
        sc.close();
    }
    public static int removing(char[] arr){
        HashMap<Character,Integer> uniques = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            if(!uniques.containsKey(arr[i])){
                uniques.put(arr[i],1);
            }
            else{
                uniques.put(arr[i],uniques.get(arr[i])+1);
            }
        }
        int uni = 0;
        for(Map.Entry<Character,Integer> entry : uniques.entrySet()){
            if(entry.getValue() == 1){
                uni += 1;
            }
        }
        return uni;
    }
}
