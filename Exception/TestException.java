public class TestException {
    public static void main(String[] args) {
        String[] in = {"hello", "good night", "good morning"};

        String ret = tstException(2, in);

        System.out.println(ret);

        ret = tstException(-1, in);

        System.out.println(ret);

        try {
            int a = quotientInt(5, 0);
        } catch (ArithmeticException ex){ //Division by 0 as denominator
            ex.printStackTrace();
        }

    }

    public static String tstException(int idx, String[] y) {
        // implement using try-catch 
        try{
            return y[idx];
        } catch (IndexOutOfBoundsException e){
            String s = "Out of Bounds";
            return s;
        }

    }

    public static int quotientInt (int a, int b){
        return a/b;
    }

    public static int quotientDoublet (double a, double b) 
    throws ArithmeticException{
        if (b==0) throw new ArithmeticException("b is zero");
        return a/b;
    }

}
