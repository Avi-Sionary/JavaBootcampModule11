public class PA extends Crew {

    private double hoursWorked;

    public PA(String name, double payRate, double hoursWorked) {
        super(name, payRate, "PA");
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void getPaid(double amount) {
        // PA is paid based on hours worked (i.e., their pay rate times their hours worked)
        // Using Math.round(a * 100.0) / 100.0 to round to the nearest two decimal places
        this.setEarned(Math.round(this.payRate * hoursWorked * 100.0) / 100.0);
        this.hoursWorked = 0;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
