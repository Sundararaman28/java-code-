import java.util.Scanner;

public class hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String str = sc.nextLine();
            String[] strarr = str.split(" ");
            int[] arr = new int[strarr.length];

            for(int i=0; i<arr.length; i++){
                int b=Integer.parseInt(strarr[i]);
                arr[i] = b;
            }
            operation(arr);

            
        }
        sc.close();
    }
    public static void operation(int[] arr){
        int row1Tot = arr[0];
        int row2Tot = arr[0];

        int monkeyA = arr[1];
        int monkeyB = arr[2];
        int monkeyC = arr[3];
        int remainSeatsA,remainSeatsB;
        int remainA,remainB;
        if (monkeyA<row1Tot) {
            remainSeatsA = row1Tot - monkeyA;
            if (monkeyB<row2Tot) {
                remainSeatsB = row2Tot - monkeyB;
                if (remainSeatsA+remainSeatsB>monkeyC) {
                    System.out.println(monkeyA+monkeyB+monkeyC);
                }
                else{
                    int b = remainSeatsA+remainSeatsB;
                    System.out.println(monkeyA+monkeyB+b);
                }
            }
            else{
                remainB = monkeyB - row2Tot;
                if (remainSeatsA>monkeyC) {
                    System.out.println(monkeyA+row2Tot+monkeyC);
                }
                else{
                    System.out.println(row1Tot+row2Tot);
                }
            }
        }
        else{
            remainA = monkeyA - row1Tot;
            if (monkeyB<row2Tot) {
                remainSeatsB = row2Tot - monkeyB;
                if (remainSeatsB>monkeyC) {
                    System.out.println(row1Tot+monkeyB+monkeyC);
                }
                else{
                    
                    System.out.println(monkeyA+monkeyB+remainSeatsB);
                }
            }
            else{
                System.out.println(row1Tot+row2Tot);
            }
        }
        
        
    }
}
