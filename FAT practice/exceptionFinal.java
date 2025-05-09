import java.util.*;


public class exceptionFinal {
    public static class invalid extends Exception{
        public invalid(String msg){
            super(msg); 
        }
    }
    public static void main(String[] args) throws invalid {
       Scanner sc = new Scanner(System.in);
       int grade = sc.nextInt();
       sc.close();
       try{

            if(grade > 100 || grade < 0) {
                throw new invalid("invalid mark!!, please check!!");
            }
            if(grade > 50) {
                System.out.println("grade is A ");
            }else{
                System.out.println("grade is B");
            }

       }catch(invalid e){
        System.out.println(e.getMessage());
       }finally
       {
        System.out.println("--------------->program executed!!");
       }
    

    }
}
