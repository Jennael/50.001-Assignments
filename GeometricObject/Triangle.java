public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    Triangle(){
        this (1.0, 1.0, 1.0);
    }

    Triangle(double A, double B, double C){
        this.side1 = A;
        this.side2 = B;
        this.side3 = C;
    }
    
    public double getArea(){
        double s = (side1+side2+side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }

    public double getPerimeter(){
        double perimeter = side1+side2+side3;
        return perimeter;
    }

    public String toString(){
        String string = "Triangle: side1 = "+side1+" side2 = "+side2+" side3 = "+side3;
        return string;
    }

}