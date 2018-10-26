import java.util.*;

public class Permutation {
    private final String in;
    private ArrayList<String> a = new ArrayList<String>();
    
    Permutation(final String str){
        in = str;
    }

    public void permute(){
        permute(this.in, "");
    }

    private void permute(String S, String s){
        if (S.isEmpty() && !(s.isEmpty())){
            a.add(s);
        }else{
            for (int i=0; i<S.length(); i++){
                String c = Character.toString(S.charAt(i));
                String temp = S.replace(c, "");
                permute(temp, s.concat(c));
            }
        }
    }

    public ArrayList<String> getA(){
        return a;
    }
}
