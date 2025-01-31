import java.util.*;

class invalid extends Exception{
    public invalid(String msg){
        super(msg);
    }
}

public class exceptionStack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();
        boolean staus = false;
        while(!staus){
            System.out.println("1.pop \n2.push \n3.peek \nExit(any number) \nEnter the integer as you want!! ");
            try{
                int a = sc.nextInt();
                if(a<0){
                    throw new invalid("The input is negative!!");
                }
                if(a < 4){
                    if(a ==1){
                        try{
                            numbers.pop();
                            System.out.println("popped!!");
                        }
                        catch(EmptyStackException e){
                            System.out.println("the is empty stack try once again");
                            System.out.println("");

                        }
                    }
                    else if(a ==2){
                        System.out.print("Enter the number to push: ");
                        try{
                            int b = sc.nextInt();
                            if(numbers.size()<6){
                                numbers.push(b);
                                System.out.println("pushed!!");
                                System.out.println("");
                            }
                            else{
                                throw new invalid("The stack is full!!");
                            }
                        }
                        catch(invalid e){
                            System.out.println(e.getMessage());
                            System.out.println("");
                        }catch(InputMismatchException e){
                            System.out.println("check with input data type!!");
                            System.out.println("");
                        }
                    }
                    else if(a==3){
                        try{
                            System.out.println("the peeked element is "+ numbers.peek());
                            System.out.println("");
                        }catch(EmptyStackException e){
                            System.out.println("The stack is Empty!! check with it!!");
                            System.out.println("");
                        }
                    }
                }
                else{
                    staus = true;
                    System.out.println(numbers);
                    System.out.println("");
                }
            }
            catch(InputMismatchException e){
                System.out.println("The input is invalid to datatype!!");
            }
            catch(invalid e){
                System.out.println(e.getMessage());
            }
            finally{
                System.out.println("th program executed succesfully!!");
            }
        }
        sc.close();
    }
}