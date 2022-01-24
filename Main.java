import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        double annualInterestRate;
        int numberOfYears;
        double loanAmount;
        Date loanDate = new Date();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        numberOfYears = input.nextInt();
        System.out.print("Enter a loan amount, for example, 120000.95: ");
        loanAmount = input.nextDouble();

        Loan loan1 = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.print("The loan was created on " + loanDate);
        System.out.format("%nThe monthly payment is %.2f", loan1.getMonthlyPayment());
        System.out.format("%nThe total payment is %.2f", loan1.getTotalPayment());
    }
}
