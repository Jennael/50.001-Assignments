// package com.cheung.lib2018midterm;

import java.util.ArrayList;
import java.util.Arrays;

//starting code

public class AllSeq {
    public static void main(String[] args) {
        String[] s = {"p", "q"};
        System.out.println(compAllSeq(s, 3));

        String[] s2 = {"1", "2", "3", "4"};
        System.out.println(compAllSeq(s2, 1));


    }
    /*
    Same concept as homework question, except to split string 
    to a certain number of characters and ensure no repeated sequence.
    */


    private static void permute(String S, String s, int k, ArrayList<String> permutations){
        if (S.isEmpty() && !(s.isEmpty())){
            String sub = s.substring(0, k);
            if (!(permutations.contains(sub))){
                permutations.add(sub);
            }

        }else{
            for (int i=0; i<S.length(); i++){
                String c = Character.toString(S.charAt(i));
                String temp = S.replace(c, "");
                permute(temp, s.concat(c), k, permutations);
            }
        }
    }

    public static ArrayList<String> compAllSeq(String[] s, int k){
        String str = "";
        for (String i:s){
            str.concat(i);
        }
        ArrayList<String> permutations = new ArrayList<String>();
        permute(str, "", k, permutations);

        return permutations; // modify this

    }

}










}
