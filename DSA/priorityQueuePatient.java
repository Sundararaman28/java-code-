import java.util.*;
import java.util.AbstractMap.SimpleEntry;



public class priorityQueuePatient {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PriorityQueue<SimpleEntry<String,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String name = sc.nextLine();
            String[] str = name.split(" ");

            pq.add(new SimpleEntry<>(str[0],Integer.parseInt(str[1])));
        }
        while (!pq.isEmpty()) {
            System.out.println("Patients in the queue are: "+ pq.peek().getKey()+ " nad priority is: "+ pq.peek().getValue());
            pq.poll();
        }
        sc.close();

    }
}
