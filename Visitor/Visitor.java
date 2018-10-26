/*
An interface which has a method 'visit', implemented when a particular visitor
e.g. PostageRegion1 is a Visitor that 'visits' an object with the interface 'visitable'.

...
public class PostageRegion1 implements Visitor... 

...
o.accept(PostageRegion1); --> PostageRegion1.visit(this)
...

*/

public interface Visitor {
    void visit (Book b);
    void visit (CD c);
    void visit (Clothing c);
}