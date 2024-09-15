import java.util.*;
public class nonReapeatingChar {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    scanner.close();

    HashMap<Character,Integer> freq = new HashMap<>();

    for (int i=0;i<text.length();i++){
      char ch = text.charAt(i);
      if (freq.containsKey(ch)) {
        freq.put(ch, freq.get(ch)+1);
      }
      else{
        freq.put(ch, 1);
      }
    }
    for (int i=0; i<text.length();i++){
      char ch1  = text.charAt(i);
      if (freq.containsKey(ch1)) {
        if(freq.get(ch1) ==1  ){
          System.out.println("the first letter of non repeatng is "+ ch1);
          break;
        }
        
      }
    }
  }
}