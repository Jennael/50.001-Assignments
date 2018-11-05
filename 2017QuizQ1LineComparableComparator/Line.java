/*
a) Four private double data fields named x1, y1, x2, y2 that specify the two endpoints of the straight line: 
    (x1, y1), (x2, y2)
b) A public no-arg constructor that creates a default Line with endpoints (0, 0) and (1,1). 
c) A public constructor that creates a Line with the specified x1, y1, x2, y2: 
    public Line(double x1, double y1, double x2, double y2)
d) A method computeSlope() that returns the slope of the straight line.  You can assume that the slope 
    is always finite.
e) A method computeLength() that returns the length of the straight line, 
    i.e. Euclidean distance between (x1, y1) and (x2, y2).
f) A method to override public String toString() to allow printing of the Line object as follow:
    Line:(x1,y1);(x2,y2)
    where (x1, y1) and (x2, y2) are the endpoints.  See example Test code.
g) Implement the Comparable<Line> interface to allow sorting of Line objects based on their length. 
    See example Test code.
*/

import java.lang.Math.*;

public class Line implements Comparable<Line>{
    private double x1, y1, x2, y2;

    Line (){
        this(0, 0, 1, 1);
    }

    Line (double X1, double Y1, double X2, double Y2){
        this.x1 = X1;
        this.y1 = Y1;
        this.x2 = X2;
        this.y2 = Y2;
    }

    public double computeSlope(){
        double yLength = this.y2-this.y1;
        double xLength = this.x2-this.x1;

        return yLength/xLength;
    }

    public double computeLength(){
        double yLength = this.y2-this.y1;
        double xLength = this.x2-this.x1;

        return Math.sqrt(Math.pow(yLength, 2) + Math.pow(xLength, 2));
    }

    public String toString(){
        String out = "Line:(" +x1+ "," +y1+ ");(" +x2+ "," +y2+ ")";
        return out;
    }

    @Override
    public int compareTo(Line l){
        if (this.computeLength()>l.computeLength()){
            return 1; //return positive integer
        } else if (this.computeLength() == l.computeLength()){
            return 0; //return 0
        } else {
            return -1; //return negative integer
        }
    }

}
