import java.util.*;
public class StringReverse {
  public static void main(String[] args) {
    Scanner sca = new Scanner(System.in);
    String text =sca.nextLine();
    int count= 0;
    sca.close();

    for( int i =0 ; i<text.length();i++){
      count++;
    }

    String reversText = "";
    for(int j = count-1;j>=0;j--){
      reversText += text.charAt(j);
    }

    System.out.println(reversText);
  }
}
