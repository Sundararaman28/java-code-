import java.util.*;

public class queueBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> numbers = new LinkedList<>();
        for(int i=0; i<5; i++){
            System.out.println("Enter the number to push: ");
            try{
                int a = sc.nextInt();
                if(!numbers.isEmpty()){
                    numbers.offer(a);
                }
                else{
                    numbers.add(a);
                    System.out.println("Queue is Created");
                }
            }
            catch(InputMismatchException e){
                System.out.println("check with input data type!!");
            }
        }
        for(int i=0; i<5; i++){
            System.out.println(numbers.poll());
        }
        
        sc.close();

    }
}
