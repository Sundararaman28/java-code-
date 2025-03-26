import java.util.*;

public class BackTr{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" "); 
        int[] arr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, new ArrayList<>(), new boolean[arr.length], result);
        
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
        sc.close();
    }

    private static void backtrack(int[] nums, List<Integer> tempList, boolean[] used, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList)); 
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; 
            
            used[i] = true;
            tempList.add(nums[i]);
            backtrack(nums, tempList, used, result);
            
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }
}