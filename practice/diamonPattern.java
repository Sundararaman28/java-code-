public class diamonPattern {
  public static void main(String[]args){
    int n =5;
    for(int i =1; i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int k =1;k<=2*i-1;k++){
        if (k%2!=0) {
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
    
    for(int x =1;x<=n-1;x++){
      for(int y =1;y<=x;y++){
        System.out.print(" ");
      }
      
      for(int z=1;z<2*(n-x);z++){
        if (z%2!=0) {
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      
      
      System.out.println("");
    }
    
  }
}
