import java.util.Scanner;

public class DepositCalculator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner -санг ашиглаж болох хувьсагчид утга оноох, оролтын сангаа
        //scanner хувьсагчийг зарласан
        double depositedAmount = scanner.nextDouble();
        int termOfTheDeposit = scanner.nextInt();
        double annualInterestRate = scanner.nextDouble();
        double amount = depositedAmount+termOfTheDeposit*((depositedAmount*(annualInterestRate/100))/12);
        //double accruedInterest = depositedAmount*interest;
        //double interest1month = accruedInterest/12;
        //double amount = depositedAmount+interest1month;
        System.out.println(amount);

    }
}