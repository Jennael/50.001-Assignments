public class Octagon implements Comparable<Octagon>{
    private double side;
    public Octagon(double side){
        this.side = side;
    }
    public double getSide() {
        return side;
    } 

    /*
    implemented Comparable built-in interface

    override the compareTo method

    Collections.sort will give ascending order by default
    */
    @Override
    public int compareTo(Octagon o){
        if (this.getSide()>o.getSide()){
            return 1; //return positive integer
        } else if (this.getSide() == o.getSide()){
            return 0; //return 0
        } else {
            return -1; //return negative integer
        }
    }
}





