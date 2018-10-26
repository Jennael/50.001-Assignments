public class Palindrome {
    public static boolean isPalindrome (char[] S) {
        int i = 0;
        while (i<S.length/2){
            if (S[i]!=S[S.length-i-1]){
                return false;
            }
            i++;
        }
        return true;           
    }
}
