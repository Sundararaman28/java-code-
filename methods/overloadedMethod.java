// package methods;

public class overloadedMethod {
  public static void main(String[] args) {
   int a = 1;
   int b = 2;
   int c = 3;
   int d = 4;
   int result = sum(a, b);
   System.out.println(result );
   int result1 = sum(a, b, c);
   System.out.println(result1);
   int result2 = sum(a, b, c, d);
   System.out.println(result2);
  }
  static int sum(int a , int b){
    System.out.println("1");
    return a+b;
  }
  static int sum(int a , int b,int c){
    System.out.println("2");
    return a+b+c;
  }
  static int sum(int a , int b,int c,int d){
    System.out.println("3");
    return a+b+c+d;
  }
}
