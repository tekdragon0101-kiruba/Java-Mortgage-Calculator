package CodeWithMosh;
import java.util.Scanner;

public class MortgageCalculator {
    final static byte numberOfMonths = 12;
  public static void main(final String[] args) {
    Scanner scanner = new Scanner(System.in);
    int principal;
    double interestRate;

    System.out.print("Principal: ");
    principal = scanner.nextInt();
    System.out.print("Annual Interest Rate: ");
    interestRate = scanner.nextDouble();
    System.out.print("Years: ");
    byte years = scanner.nextByte();
    scanner.close();

  System.out.println("Mortgage: $"+ calculateInterest(principal, interestRate, years));
   }

  public static double calculateInterest(int principal, double interestRate, byte years) {
    short months = (short) (years * numberOfMonths);
    double monthlyInterestRate = interestRate/(numberOfMonths*100);

    double results = principal * (( monthlyInterestRate * Math.pow(1+monthlyInterestRate,months))/
    (Math.pow(1+monthlyInterestRate,months) - 1));
    // System.out.println(results);
    return results;
  }
}
