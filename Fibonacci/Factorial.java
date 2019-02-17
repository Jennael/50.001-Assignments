
import java.util.*;

public class Factorial {   

    public static ArrayList compute (int n) {
        //int count = 1;
        int total = 1;
        ArrayList<Integer> out = new ArrayList<>();
        //return compute (out, total, n, count);
        return compute (out, total, n);
    }    

    //total is n*(n-1)*(n-2)...(n-i)
    //n is (n-i)
    //public static ArrayList compute (ArrayList<Integer> out, int total, int n, int count) {
    public static ArrayList compute (ArrayList<Integer> out, int total, int n) {
        if (n > 0){
//            System.out.println(count);
            count += 1;
            int result = n*total;
            out.add(result);
            int newn = n-1;
            //return compute(out, result, newn, count);
            return compute(out, result, newn);

        } else {
            return out;
        }
    }

}