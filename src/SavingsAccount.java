import java.util.Random;

public class SavingsAccount {
    String accountNumber;
    String accountHolderName;
    double accountBalance;
    String accountStatus;

    public double retrieveBalance(){
        return accountBalance;
    }
    public double creditCash(double amount){
        accountBalance = accountBalance + amount;
        return accountBalance;
    }
    public double debitCash(double amount){
        return accountBalance-amount;
    }

    public String getAccountNumber(){
        Random obj = new Random();
        String number = "";
        for (int i = 1; i < 13; i++) {
            int num = obj.nextInt(10);
            if(num > 0) {
                number = number + num;
            }
        }
        return number;
    }
}
