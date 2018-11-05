import java.util.Date;

//starting code

public class Account implements Comparable<Account>{
    private String id;
    private double balance;
    private Date dateCreated;

    Account (String ID, double Bal) {
        this.id = ID;
        this.balance = Bal;
        this.dateCreated = new Date();
    }

    public String getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public Date getDate(){
        return this.dateCreated;
    }

    @Override
    public String toString(){
        String out = "";
        out.concat("Account:" +this.id);
        return out;
    }

    @Override
    public int compareTo(Account a){
        if (this.getBalance()>a.getBalance()){
            return 1; //return positive integer
        } else if (this.getBalance() == a.getBalance()){
            return 0; //return 0
        } else {
            return -1; //return negative integer
        }
    }

}