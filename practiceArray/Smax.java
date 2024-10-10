import java.util.*;
class Smax {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    int max = 0;
    int smax = 1;
    for ( int j = 0; j<n; j++ ){
        if(arr[j] > arr[max]){
            smax = max; 
            max = j;
        }else if(arr[j]>arr[smax] && arr[j]<arr[max]){
            smax = j;
        }
    }
    sc.close();
    System.out.print("the second largest index is: "+smax);
    }
} 