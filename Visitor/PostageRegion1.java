public class PostageRegion1 implements Visitor {
    private double total = 0;

    public void visit (Book b) {
        total += b.getWeight()*20;;
    }

    public void visit (CD c) {
        total += 10;
    }

    public void visit (Clothing c){
        total += c.getSize()*10;
    }

    public double getTotal(){
        return this.total;
    }

}