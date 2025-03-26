import java.util.*;
public class shiftingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp  = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        sc.close();
        System.out.println(Arrays.toString(arr));
    }
}
