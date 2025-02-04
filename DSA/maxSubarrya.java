import java.util.*;

class maxSubarray {
    public static int maxAscendingSum(Stack<Integer> stk) {
        int tot = 0;
        while(!stk.empty()){
            tot += stk.pop();
        }
        return tot;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int[] arr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        int tot = 0;
        Stack<Integer> stk = new Stack<>();
        stk.push(arr[0]);
        for(int j=1; j<arr.length; j++){
            if(arr[j]>arr[j-1]){
                stk.push(arr[j]);
            }
            else{
               int temp = maxAscendingSum(stk);
               if(temp>tot){
                tot = temp;
               }
               stk.clear();
               stk.push(arr[j]);
            }
        }
        tot = Math.max(tot, maxAscendingSum(stk));
        System.out.print(tot);
        sc.close();

    }
}
