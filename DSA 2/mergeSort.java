import java.util.*;

public class mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        int[] result = algo(arr,0,arr.length-1);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
    public static int[] algo(int[] arr, int left, int right){
        if(left == right){
            return arr;
        }
        int mid = (left + right)/ 2;
        algo(arr, left, mid);
        algo(arr, mid+1, right);
        int[] array = merge(arr,left,mid,right);
        return array;
    }
    
    public static int[] merge(int[] arr, int left, int mid, int right){
        int low = left;
        int point = left; 
        int high = mid + 1;
        int[] temp = new int[arr.length];
        while(low <= mid && high <= right){
            if(arr[low] <= arr[high]){
                temp[point] = arr[low];
                low++;
                point++;
            }
            else{
                temp[point] = arr[high];
                high++;
                point++;
            }
        }
        while(low <= mid){
            temp[point] = arr[low++];
            point++;
        }
        while(high <= right){
            temp[point] = arr[high++];
            point++;
        }
        for(int i=left; i<= right; i++){
            arr[i] = temp[i];
        }
        return arr;
    }

}
