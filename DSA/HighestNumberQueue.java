import java.util.*;
public class HighestNumberQueue {

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
        System.out.println("the highest number from the given series of the number is"+ numbers.peek());
    }
}
