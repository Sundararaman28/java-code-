import java.util.*;
public class mostFrequent {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    scanner.close();

    text = text.toUpperCase();

    HashMap<Character , Integer > frequency = new HashMap<>();

    for ( int i =0;i<text.length();i++){
      char ch = text.charAt(i);
      if (frequency.containsKey(ch)) {
        frequency.put(ch, frequency.get(ch)+1);
      }
      else{
        frequency.put(ch, 1);
      }
    }
    int max = 0;
    List<Character> maxCharacters = new ArrayList();
    for (Map.Entry<Character, Integer> ent : frequency.entrySet()){
      if (ent.getValue()>max) {
        max = ent.getValue();
        maxCharacters.add(ent.getKey());
      }
      else if(ent.getValue() == max){
        maxCharacters.add(ent.getKey());
      }
    }
    System.out.println("the maximum letter occured is " +  maxCharacters + " and " + max +" times..");
    System.out.println(maxCharacters);
  }
}
