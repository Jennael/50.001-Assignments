import java.util.*;

public class CheckingAccount extends Account{

    public CheckingAccount(int Id, double Balance) {
        super(Id, Balance);
    }

    public CheckingAccount() {
        this(0, 0);
    }

    public void withdraw(double amt) {
        double balance = getBalance();
        double newBalance = balance-amt;
        if (newBalance < -5000) {
            System.out.println("over limit");            
        } else {
            setBalance(newBalance);
        }

    }
}