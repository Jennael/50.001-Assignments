import java.lang.*;

public class MyRectangle2D {

    private double x;
    private double y;
    private double width;
    private double height;

    private double xleft = this.x - (this.width)/2;
    private double xright = this.y + (this.width)/2;
    private double ybot = this.y - (this.height)/2;
    private double ytop = this.y + (this.height)/2;


    MyRectangle2D(double X, double Y, double Width, double Height){
        this.x = X;
        this.y = Y;
        this.width = Width;
        this.height = Height;
    }

    MyRectangle2D(){
        this(0, 0, 1, 1);
    }

    public double getX(){
        return this.x;
    }

    public void setX(double X){
        this.x = X;
    }

    public double getY(){
        return this.y;
    }

    public void setY(double Y){
        this.y = Y;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double Width){
        this.width = Width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double Height){
        this.height = Height;
    }

    public double getArea(){
        return this.height*this.width;
    }

    public double getPerimeter(){
        return 2*this.width + 2*this.height;
    }

    public boolean checkPoint(double X, double Y){

        if (Math.abs(X - this.x) <= this.width/2 && Math.abs(Y - this.y) <= this.height/2) {
            return true;
        } else {
            return false;
        }

        /*
        if (X >= this.xleft && X <= this.xright && Y >= this.ybot && Y <= this.ytop){
            return true;
        } else {
            return false;
        }*/
        
    }

    public boolean checkInside(MyRectangle2D rectangle){
        if (checkPoint(rectangle.xleft, rectangle.ytop) 
        && checkPoint(rectangle.xleft, rectangle.ybot) 
        && checkPoint(rectangle.xright, rectangle.ytop) 
        && checkPoint(rectangle.xright, rectangle.ybot)){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean checkOverlap(MyRectangle2D rectangle){
        if (checkPoint(rectangle.xleft, rectangle.ytop) 
        || checkPoint(rectangle.xleft, rectangle.ybot) 
        || checkPoint(rectangle.xright, rectangle.ytop) 
        || checkPoint(rectangle.xright, rectangle.ybot) 
        || checkPoint(rectangle.x, rectangle.y)){
            return true;
        } else{
            return false;
        }

    }

}


/*
SARTHAK'S CODE

public class MyRectangle2D {
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    double x;
    double y;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double width;
    double height;

    MyRectangle2D() {
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width*height;
    }

    double getPerimeter() {
        return 2*(width + height);
    }

    boolean contains(double x, double y) {
        return ((x > (this.x - (this.width)/2) && 
        (x < (this.x + (this.width)/2))) && 
        (y > (this.y - (this.height)/2) && 
        (y < (this.y + (this.height)/2))));
    }

    public boolean contains(MyRectangle2D r) {
        return ((Math.abs(r.x - x) <= (width - r.width)/2) && 
        (Math.abs(r.y - y) <= (height - r.height)/2));
    }

    public boolean overlaps(MyRectangle2D r) {
        return ((Math.abs(r.x - x) <= (width + r.width)/2) && (Math.abs(r.y - y) <= (height + r.height)/2));
    }
}
*/



