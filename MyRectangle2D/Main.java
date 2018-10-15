public class Main{
    public static void main (String[] args) {

        MyRectangle2D rect1 = new MyRectangle2D(8, 14, 6, 8);
        MyRectangle2D rect2 = new MyRectangle2D(8, 14, 2, 2);
        boolean result = rect1.checkInside(rect2);

        System.out.println(result);



    }
}