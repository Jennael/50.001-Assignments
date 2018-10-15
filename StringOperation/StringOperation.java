import java.util.*;

public class StringOperation{
    public static boolean isAllCharacterUnique (String s){
        String[] ls = s.split("");
        HashMap<String, Integer> dict = new HashMap<>();
        for (String i: ls){
            Integer v = dict.get(i);
            if (v != null){
                return false;
                
            } else {
                dict.put(i, 1);
            }
        }
        return true;
    }

    public static boolean isPermutation (String s, String ss) {
        char[] ls = s.toCharArray();
        char[] lss = ss.toCharArray();

        if (s.length() != ss.length()){
            return false;
        }

        Arrays.sort(ls);
        Arrays.sort(lss);

        if (Arrays.equals(ls, lss)){
            return true;
        } else {
            return false;
        }


    }

}