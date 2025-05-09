import java.util.*;

class Bank{
    int pin = 1234;
    int bal = 10000;
    Scanner sc = new Scanner(System.in);
    
    public void checkBalance(){
        int t = 3;
        while(t>0){
            System.out.print("Enter the PIN: ");
            int i = sc.nextInt();
            if(i == pin){
                System.out.println("Current Balance: "+bal);
                break;
            }else {
                System.out.println("Incorrect PIN!");
                t--;
                System.out.println("Remaining Attempts: "+t);
            }
        }
    }

    public void Withdraw() {
        int t = 3;
        while (t > 0) {
            System.out.print("Enter the PIN: ");
            int i = sc.nextInt();
            if (i == pin) {
                System.out.print("Withdraw Amount: ");
                int amount = sc.nextInt();
                if (bal >= amount) {
                    bal -= amount;
                    System.out.println("Withdraw Successful, Updated Balance: " + bal);
                } else {
                    System.out.println("Insufficient Balance!, Current Balance: " + bal);
                }
                break;
            } else {
                System.out.println("Incorrect PIN!");
                t--;
                System.out.println("Remaining Attempts: " + t);
            }
        }
    }

    public void Deposit() {
        int t = 3;
        while (t > 0) {
            System.out.print("Enter the PIN: ");
            int i = sc.nextInt();
            if (i == pin) {
                System.out.print("Deposit Amount: ");
                int amount = sc.nextInt();
                bal += amount;
                System.out.println("Congrats, Deposit Successful! Updated Balance: " + bal);
                break;
            } else {
                System.out.println("Incorrect PIN!");
                t--;
                System.out.println("Remaining Attempts: " + t);
            }
        }
    }
}


public class ATM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the ATM!\nPlease select an option:\n1. Check Balance('CB')\n2. Withdraw Money('WM')\n3. Deposit Money('DM')\n" + //
                        "4. EXIT");
        Bank bank = new Bank();
        try{
            boolean st =true;
            while(st){
                System.out.println("------------------------------------");
                System.out.print("Enter your option: ");
                String str = sc.nextLine();
                if(str.equals("CB")){
                    System.out.println("Check Balance!!");
                    bank.checkBalance();
                }else if(str.equals("WM")){
                    System.out.println("Withdraw Amount!!");
                    System.out.print("Enter the PIN: ");
                    bank.Withdraw();
                }else if(str.equals("DM")){
                    System.out.println("Desposit Amount!!");
                    System.out.print("Enter the PIN: ");
                    bank.Deposit();
                }else if(str.equals("EXIT")){
                    System.out.print("Exited!!, Thanks for Contributing!!");
                    st = false;
                }else{
                    System.out.println("***Enter the option correctly***");
                }
            }
        }catch(InputMismatchException e){
            System.out.println("Ivalid input retry!!");
        }
        sc.close();
    }
}



