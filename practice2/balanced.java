import java.util.*;

public class balanced {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testcases = sc.nextInt();
  
    while(testcases > 0){
      int arrlen = sc.nextInt();
      sc.nextLine();

      if (arrlen%2 == 0) {
        continue;
      }

      String strarray = sc.nextLine();
      String[] strarr = strarray.split(" ");
      int[] arr = new int[arrlen];

      //string to int array
      for(int i=0; i<arrlen; i++){
        int b = Integer.parseInt(strarr[i]);
        arr[i] = b;
      }
      int[]result = opertaion(arr);   
      System.err.println(Arrays.toString(result));    
    }
    sc.close();
  }
  public static int[] opertaion(int[] array1){
    int[] operationCount = new int[array1.length];
    for(int i =0; i<array1.length; i++){
      int[] duplicateArray = Arrays.copyOf(array1, array1.length);
      if (i==0) {
        duplicateArray[array1.length-1] += 1;
        duplicateArray[i] += 2;
        duplicateArray[i+2] +=1;
      }
      else if (i==array1.length-1) {
        duplicateArray[i-1] += 1;
        duplicateArray[i] +=2;
        duplicateArray[0] +=1;
      }
      else{
        duplicateArray[i-1] +=1;
        duplicateArray[i] +=2;
        duplicateArray[i+1] += 1;
      }
      operationCount[i] += 1;
      boolean balanced = checkValidity(duplicateArray);
      if (balanced) {
        return operationCount;
      }
    }
    return operationCount;
    
  
  }
  public static boolean checkValidity(int[] dup){
    boolean value = true;
    for(int i = 0; i<dup.length; i++){
      if (dup[0] != dup[i]) {
        value = false;
      }
    }
    return value;
    
  }
}       
