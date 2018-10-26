/*
A non-abstract class that is a Visitor, and has a overloaded method 'visit'.
When it 'visit' an object that is visitable, (code) happens depending on 
which class the object is.

...
public class PostageRegion1 implements Visitor... 

...
o.accept(PostageRegion1); --> PostageRegion1.visit(this)
...

*/

public class PostageRegion1 implements Visitor {
    private double total = 0;

    public void visit (Book b) {
        total += b.getWeight()*20;
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