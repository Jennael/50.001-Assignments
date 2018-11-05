public class Fish implements Observer {
	private Subject subject;    
    private String id;

    public Fish(String id, Subject subject) {
        this.id = id;
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void update (int t){
        String s = "Fish " + this.id + " received temperature alert: " + t;
	    System.out.println(s);
    }


}
