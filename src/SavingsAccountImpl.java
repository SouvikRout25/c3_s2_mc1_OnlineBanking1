import java.util.Random;
import java.util.Scanner;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = scanner.nextInt();
        if(age >= 18){
            savingsAccount.accountNumber =  savingsAccount.getAccountNumber();
            scanner.nextLine();
            System.out.println("Enter your name :");
            savingsAccount.accountHolderName = scanner.nextLine();
            System.out.println("Enter balance with which you want to open account :");
            savingsAccount.accountBalance = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter account stats :");
            savingsAccount.accountStatus = scanner.nextLine();
            System.out.println("Account Number is :" + savingsAccount.accountNumber);
            System.out.println("Account Holder Name is :" + savingsAccount.accountHolderName);
            System.out.println("Account Status is :" + savingsAccount.accountStatus);

            System.out.println("Account balance is : $" + savingsAccount.retrieveBalance());

            System.out.println("Enter the amount you want to credit :");
            int amount1 = scanner.nextInt();
            System.out.println("Balance after crediting cash is : $" + savingsAccount.creditCash(amount1));
            System.out.println("Enter the amount you want to debit :");
            int amount2 = scanner.nextInt();
            System.out.println("Balance after debiting cash is : $" + savingsAccount.debitCash(amount2));
        }

        else if (age < 18) {
            System.out.println("You are not eligible to open bank account.");
        }
    }
}