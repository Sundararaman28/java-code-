import java.util.*;
public class RegularBracketSequence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCases = sc.nextInt();
    sc.nextLine();
    for(int i =0; i<testCases; i++){
      String str = sc.nextLine();
      int s = str.length();
      int count =0;
      for(int l=1; l<=s; l++){
        for(int r=l; r<=s; r++){

          String substring = str.substring(l - 1, r);
          String inversedSubstring = inverse(substring);
          String result = str.substring(0, l) + inversedSubstring + str.substring(r);
          String validity = checkvalidity(result);
          if (validity == "yes") {
            count++;
          }
        }
      }
      System.out.println(count);
    }
    sc.close();
  }

  public static String inverse(String substr){
    StringBuilder sb = new StringBuilder();  // Creates an empty StringBuilder
    int len = substr.length();
    for(int i =0; i<len; i++){
      char ch = substr.charAt(i);
      if (ch =='(') {
        sb.append(')');
      }
      else{
        sb.append('(');
      }
    }
    return sb.toString();
  }

  public static String checkvalidity(String value){
    int open =0;
    
    for(int i =0; i<value.length(); i++){
      char ch = value.charAt(i);
      if (ch =='(') {
        open += 1;
      }
      else{
        open -= 1;
      }
    }
    if (open == 0) {
      return "yes";
    }
    else{
      return "no";
    }
    
  }
}
