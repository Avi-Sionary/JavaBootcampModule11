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
    public void getPaid(double amount) {}
}
