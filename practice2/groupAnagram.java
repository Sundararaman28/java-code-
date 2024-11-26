import java.util.*;
public class groupAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strarr = str.split(" ");
        operation(strarr);
        sc.close();
    }
    public static void operation(String[] arr){
        boolean[] visited = new boolean[arr.length];
        for(int i=0; i<arr.length; i++){
            visited[i] = false;
        }
        for(int j=0; j<arr.length; j++){
            if (visited[j]) {
                continue;
            }
            else{
                char[] ch = arr[j].toCharArray();
                Arrays.sort(ch);
                visited[j] = true;
                System.out.print(arr[j] + " ");
                for(int k=j+1; k<arr.length; k++){
                    char[] ch1 = arr[k].toCharArray();
                    Arrays.sort(ch1);
                    if (Arrays.equals(ch,ch1)) {
                        System.out.print(arr[k]+" ");
                        visited[k] =true;
                    }
                }
                System.out.println("");
            }
        }
    }
}
