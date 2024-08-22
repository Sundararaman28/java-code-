package practice;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortageCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter the principle amount: ");
    int prin = scanner.nextInt();
    System.out.print("enter the interest rate(yearly): ");
    double rate = scanner.nextDouble();
    System.out.print("enter the time period to pay back (yearly):" );
    int time = scanner.nextInt();
    scanner.close();

    double moratageValue;
    double realrate = (rate/100)/12;
    int realtime = time*12;

    double numerator = realrate*(Math.pow((1+realrate),realtime));
    double denominator = (Math.pow((1+realrate),realtime)) - 1 ;
    moratageValue = prin*(numerator/denominator);

    String mortageString = NumberFormat.getCurrencyInstance().format(moratageValue);
    System.out.println(mortageString);
  }
}
