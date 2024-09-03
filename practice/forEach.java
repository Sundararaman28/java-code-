import java.util.*;

public class forEach {
  public static void main(String[] args) {
    // String[] animals = {"cat","dog","donkey"};
    ArrayList<String> animals = new ArrayList<String>();

    animals.add("dog");
    animals.add("cat");
    animals.add("donkey");
    

    for(String i : animals){
      System.out.println(i);
    }
  }
}
