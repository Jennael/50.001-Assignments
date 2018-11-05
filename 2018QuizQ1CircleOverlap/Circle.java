import java.lang.Math.*;

public class Circle {
    
    private double x, y;
    private double radius;

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double getRadius(){
        return this.radius;
    }

    Circle(double X, double Y, double R){
        this.x = X;
        this.y = Y;
        this.radius = R;
    }

    Circle(){
        this(0, 0, 1);
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    //distance between circle Center and Point
    private double distance(double px, double py){
        return Math.sqrt( Math.pow(this.y-py, 2) + Math.pow(this.x-px, 2) );
    }

    //if a circle contains Point
    public boolean contains(double px, double py){
        
        //distance between circle center and point <= than radius
        if (this.distance(px, py) <= this.radius){ 
            return true;
        }else{
            return false;
        }
    }

    //distance between circle Center and c Center
    private double distance(Circle c1){
        return Math.sqrt( Math.pow(this.y-c1.y, 2) + Math.pow(this.x-c1.x, 2) );
    }

    //if circle contains c
    public boolean contains(Circle c){

        //R-r
        double allowance = this.radius-c.radius;

        //center of smaller circle is in big circle
        if (this.contains(c.x, c.y)){ 

            //radius of small circle is at most at distance R-r
            if (this.distance(c)<=allowance){
                return true;
            }
        }
        return false;
    }

    //if circle overlap with c
    public boolean overlaps(Circle c){

        if (this.radius>= c.radius){
            double min = this.radius-c.radius;
            double max = this.radius+c.radius;
    
            if (this.distance(c) <= max && this.distance(c) >= min){
                return true;
            }
            return false;

        }else{
            double min = c.radius-this.radius; 
            double max = c.radius+this.radius;
    
            if (c.distance(this) <= max && c.distance(this) >= min){
                return true;
            }
            return false;
        }

    }

}