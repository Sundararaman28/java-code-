class helloClass {
  int age = 30;
    class InnerinnerClass2 {
      String name = "sundar";
  }
}

class innerClass {
  public static void main(String[] args) {
    helloClass objout = new helloClass();
    helloClass.InnerinnerClass2 objin = objout. new InnerinnerClass2();
    System.out.println(age);
  }
}

