import java.util.*;
public class queueBasic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> numbers = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<5; i++){
            System.out.println("Enter the number to push: ");
            try{
                int a = sc.nextInt();
                numbers.offer(a);
            }
            catch(InputMismatchException e){
                System.out.println("check with input data type!!");
            }
        }
        System.out.println("");
        while(!numbers.isEmpty()){
            System.out.println(numbers.poll());
        }
        sc.close();

    }
}
