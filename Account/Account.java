// ATTENTION 
// just edit this file
// TestAccount.java contains the test cases provided in the problem set 
// Put in any import statements that you need 

//package Account;
import java.util.*;

public class Account {
     int id;
     double balance;
     static double AnnualInterestRate = 0;
     Date dateCreated;

    public Account(int Id, double Balance) {
        id = Id;
        balance = Balance;
        dateCreated = new Date();
    }

    public Account() {
        this(0, 0);
    }

    //id
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //balance
    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //rate
    public static double getAnnualInterestRate() {
        return AnnualInterestRate;
    }
    public static void setAnnualInterestRate(double newRate) {
        AnnualInterestRate = newRate;
    }
    public static double getMonthlyInterestRate() {
        return AnnualInterestRate/12;
    }
    public double getMonthlyInterest() {
        return this.balance*getMonthlyInterestRate()/100;
    }

    //date
    public Date getDate() {
        return this.dateCreated;
    }

    public void withdraw(double amt) {
        this.balance -= amt;
    }

    public void deposit(double amt) {
        this.balance += amt;
    }

}
