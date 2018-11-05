import java.util.*;

public class OctagonComparator implements Comparator<Octagon>{ 

    /*
    implemented Comparator built-in interface

    override the compare method

    Collections.sort will give ascending order by default

    DIFFERENCE from Comparable:
    - allows use of multiple sorting sequences
    - you have to create a comparator class separately instead of modifying the class to be sorted
    */

    public int compare(Octagon o1, Octagon o2){
        if (o1.getSide()>o2.getSide()){
            return 1;
        } else if (o1.getSide() == o2.getSide()){
            return 0;
        } else {
            return -1;
        }
    }
}