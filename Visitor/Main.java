public class Main{
    public static void main(String[] arge){
        PostageRegion1 p = new PostageRegion1();

        ArrayList<Visitable> l = new ArrayList<>();
        l.add(new Book(2));
        l.add(new CD("man"));
        l.add(new Book(10));
        l.add(new Clothing(1));
        //l.add(new Chicken()); Cannot add as its not visitable

        for (Visitable v:l){
            v.accept(p);
        }
        
        PostageHoliday p2 = new PostageHoliday();

        for (Visitable v:l){
            v.accept(p2);
        }

    }
}


class Chicken {
    // does not implement visitable --static checking
}

class Book implements Visitable {
    private double weight;

    public void accept (Visitor v){
        v.visit (this);
    }

    public Book (double weight) {
        this.weight=weight;
    }

    public double getWeight(){
        return weight;
    }

}

class CD implements Visitable {
    private String artist;

    public void accept(Visitor v){
        v.visit(this);
    }

    public CD (String artist) {
        this.artist=artist;
    }

    public String getArtist() {
        return artist;
    }

}


class Clothing implements Visitable{
    private double size;

    public void accept(Visitor v){
        v.visit(this);
    }

    public double getSize(){
        return size;
    }

    Clothing (double size){
        this.size=size;
    }

}

/*
NOTES ON VISITOR DESIGN PATTERN:
---------------------------------------------------------------------
public interface Visitor {
    void visit (Book b);
    void visit (CD c);
    void visit (Clothing c);
}

public interface Visitable {
    void accept (Visitor v);
}
---------------------------------------------------------------------

PostageRegion1 p1 = new PostageRegion1(); --> public class PostageRegion1 implements Visitor which has visit method
Book b = new Book(); --> public class Book implements Visitable which has accept method

Step 1. main object accepts visitor
main: 
    b.accept(p);

Step 2. object has accept method which calls visitor's visit method
Book: 
    public void accept (Visitor v){
        v.visit (this);
    }

Step 3. visitor's visit method makes changes to object
PostageRegion1:     
    public void visit (Book b) {
        total += b.getWeight()*20;
    }


*/
