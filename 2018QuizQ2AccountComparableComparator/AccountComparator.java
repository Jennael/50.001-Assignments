import java.util.Comparator;
//starting code

public class AccountComparator implements Comparator<Account>{
    
    public int compare(Account a1, Account a2){
        if (a1.getId() > a2.getId()){
            return 1;
        } else if (a1.getId() == a2.getId()){
            return 0;
        } else {
            return -1;
        }
    }

}
