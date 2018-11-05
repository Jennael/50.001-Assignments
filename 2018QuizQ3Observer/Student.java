public class Student implements Observer{
	private Subject subject;    
    private String id;

    public Student(String id, Subject subject) {
        this.id = id;
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void update (int t){
        String s = "Student " + this.id + " received temperature alert: " + t;
	    System.out.println(s);
    }


}
