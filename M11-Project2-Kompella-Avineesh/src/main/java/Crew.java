public class Crew extends Person {

    protected String dept;

    public Crew(String name, double payRate, String dept) {
        super(name, payRate);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public void getPaid(double amount) {
        // We're assuming that a Crew Member is paid a fix amount (i.e., their payRate)
        this.setEarned(amount);
    }
}
