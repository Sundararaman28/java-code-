public class extractString {
  public static void main(String[] args) {
    String[] passengers = {"8838529579M4102","7448907020M6103","7667569556M6221"};
    String mobile = "";
    String sex = "";
    String age ="";
    int Age = 0;
    String seat = "";
    int count = 0;
    for (int j =0;j<passengers.length;j++){
      for (int i =0 ; i<passengers[j].length();i++){
        if (i<10) {
          mobile += passengers[j].charAt(i);
        }

        else if (i==10) {
          sex += passengers[j].charAt(i);
        }

        else if (i<13 && i>10) {
          age += passengers[j].charAt(i);
          Age = Integer.parseInt(age);
          if (Age>60 && i==12) {
            count++;
            age = "";
          }
        }
        
        else if (i<15 && i>13) {
          seat += passengers[j].charAt(i);
        }
      }
    }
    System.out.println(mobile);
    System.out.println(age);
    System.out.println(sex);
    System.out.println(seat);
    System.out.println("the number of passengers has the age above 60:" + count);
       
  }
  
}
