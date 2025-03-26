import java.util.*;
public class nextGreatest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr =  new int[str.length];

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        int[] finalarr = operation(arr);
        System.out.println(Arrays.toString(finalarr));
        sc.close();
    }

    public static int[] operation(int[] arr){
        Stack<Integer> stk = new Stack<>();
        /*int index = 0;
        while (index < arr.length) {
            boolean st = false;
            for(int i=index+1; i<arr.length-1;i++){
                if(arr[i] > arr[index]) {
                    stk.push(arr[i]);
                    st = true;
                    index++;
                    break;
                }
            }
            if(!st) {
                stk.push(-1);
                index++;
            }
        }
        return stk.stream().mapToInt(Integer::intValue).toArray();*/
        int[] result1 = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            while(!stk.isEmpty() && stk.peek() <= arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                result1[i] = -1;
            }
            else{
                result1[i] = stk.peek();
            }
            stk.push(arr[i]);
        }
        return result1;

    }
}