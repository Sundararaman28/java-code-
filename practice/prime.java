public class prime {
  public static void main(String[]args){
    int n=13;
    boolean isPrime =true;
    for (int i=1;i<=n;i++){
      if (i==1 ||i==n ) {
        continue;
      }
      else if (n%i==0) {
        isPrime =false;
        break;
      }
    }
    if (isPrime) {
      System.err.println("the given number is prime!!");      
    }
    else{
      System.out.println("the given number is not!!");
    }
  }
}
