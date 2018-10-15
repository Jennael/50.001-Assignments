

public class Circle extends GeometricObject {
    
    private double radius;
    
    Circle(){
        radius = 1;
    }

    double getArea() {
        return radius*radius* Math.PI;
    }


}