public class Actor extends Person {

    protected String role;

    public Actor(String name, double payRate, String role) {
        super(name, payRate);
        this.role = role; // Assuming this is the character they play
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void getPaid(double amount) {
        // We're assuming that an Actor is paid a fix amount (i.e., their payRate)
        this.setEarned(amount);
    }
}
