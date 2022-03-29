public abstract class Person {

    protected String name;
    protected double payRate;
    protected double earned;

    public Person(String name, double payRate) {
        this.name = name;
        this.payRate = payRate;
        this.earned = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getEarned() {
        return earned;
    }

    public void setEarned(double earned) {
        this.earned = earned;
    }

    public abstract void getPaid(double amount);
}
