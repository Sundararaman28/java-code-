import java.security.KeyStore.Entry;
import java.util.*;
class invalid extends Exception{
    public invalid(String err){
        super(err);
    }
}
public class employeeNamesMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=5;
        HashMap<String,Integer> emp = new HashMap<>();
        while(i>0){
            try{
                String name = sc.nextLine();
                int salary = sc.nextInt();
                sc.nextLine();
                if(salary<0){
                    throw new invalid("The given salary is negative!!");
                }
                emp.put(name, salary);
                i--;
            }
            catch(invalid e){
                System.out.println(e.getMessage());
            }
            catch(InputMismatchException e){
                System.out.println("check your entered data");
            }

            finally{
                System.out.println("The program executed succesfully!!");
            }
           
        }
        sc.close();
        
        
    }
}
