import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1; i<11; i++){
            numbers.add(i);
        }
        Iterator<Integer> its = numbers.iterator();
        while(its.hasNext()){
            int b= its.next();
            if(b%2 == 0){
                its.remove();
            }
        }
        System.out.println(numbers);

    }
}
