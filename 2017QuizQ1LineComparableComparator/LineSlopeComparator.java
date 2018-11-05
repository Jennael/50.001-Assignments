import java.util.*; 

public class LineSlopeComparator implements Comparator<Line>{
    
    public int compare(Line l1, Line l2){

        if (l1.computeSlope()>l2.computeSlope()){
            return 1; //return positive integer
        } else if (l1.computeSlope() == l2.computeSlope()){
            return 0; //return 0
        } else {
            return -1; //return negative integer
        }
    }

}
