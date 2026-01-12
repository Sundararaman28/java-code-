import java.util.ArrayList;
public class ArrayLis1 {
  public static void main(String[] args) {
    /*ArrayList<String> food = new ArrayList<String>();

    food.add("pizza");
    food.add("hotdog");
    food.add("burger");

    food.set(0, "sushi");
    food.remove(2);
    food.clear();

    for (int i =0;i<food.size();i++){
      System.out.println(food.get(i));
    }*/

    //2d Array list 
    ArrayList<ArrayList<String>> grocery = new ArrayList();
    ArrayList<String> bakeryList = new ArrayList();
    bakeryList.add("pasta");
    bakeryList.add("garlic bread");
    bakeryList.add("donuts");

    ArrayList<String> fruitList = new ArrayList();
    fruitList.add("apple");
    fruitList.add("orange");
    fruitList.add("bannana");

    ArrayList<String> drinks = new ArrayList();
    drinks.add("mountain due");
    drinks.add("sting");
    drinks.add("7up");

    grocery.add(bakeryList);
    grocery.add(drinks);
    grocery.add(fruitList);

    System.out.println(grocery);
    System.out.println(drinks);
    System.out.println(fruitList);

  }
}
