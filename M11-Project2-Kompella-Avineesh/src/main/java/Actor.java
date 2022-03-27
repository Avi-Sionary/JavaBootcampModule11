public class Actor extends Person {

    protected String role;

    public Actor(String name, double payRate, String role) {

        super(name, payRate);
        this.role = role;

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void getPaid(double amount) {}
}
