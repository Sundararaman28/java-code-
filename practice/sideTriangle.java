public class sideTriangle {
  public static void main(String[]args){
    int n=5;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println("");
    }
    for (int x=1;x<=n-1;x++){
      for (int y=1;y<=n-x;y++){
        System.out.print("*");
      }
      System.err.println("");
    }
  }  
}
