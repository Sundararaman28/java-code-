public class swap {
  public static void main(String[] args) {
    int a=100;
    int b=200;
    System.out.println(a);
    System.out.println(b);
    System.out.println("Before swap");
    int temp;
    temp=b;
    b=a;
    a=temp;
    System.out.println(a);
    System.out.println(b);
  }
}