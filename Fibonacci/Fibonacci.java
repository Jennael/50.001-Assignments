
import java.util.*;

public class Fibonacci {   

    public static ArrayList compute (int n) {
        int count = 1;
        ArrayList<Integer> out = new ArrayList<>();
        out.add(0);
        out.add(1);

        return compute(out, 0, 1, n, count);

    }    

    public static ArrayList compute (ArrayList<Integer> out, int a, int b, int n, int count) {
        count += 1;
        int sum = a+b;
        if ((sum) == n){
            out.add(sum);
            return out;
        } else if (sum > n) {
            return out;
        } else {
            out.add(sum);
            return compute (out, b, sum, n, count);
        }
    }

}


