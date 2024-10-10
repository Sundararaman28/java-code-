import java.util.*;
class removeDuplicate {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for ( int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    HashSet<Integer> myObj = new HashSet<Integer>();
    for (int j =0; j<n; j++ ){
        if(myObj.contains(arr[j])){
            continue;
        }
        else{
            myObj.add(arr[j]);
        }
    }
    System.out.print(myObj);
    sc.close();
    }
}