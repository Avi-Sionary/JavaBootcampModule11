public class Director extends Crew {

    public Director(String name) {
        super(name, 0, "Director");
    }

    @Override
    public void getPaid(double amount) {

        // Using Math.round(a * 100.0) / 100.0 to round to the nearest two decimal places
        this.setEarned(Math.round(.01 * amount * 100.0) / 100.0);

    }
}
