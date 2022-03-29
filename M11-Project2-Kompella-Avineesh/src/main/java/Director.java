public class Director extends Crew {

    public Director(String name) {
        super(name, 0, "Director");
    }

    @Override
    public void getPaid(double amount) {
        // Director earns 10% royalty based on movie profit (AKA the amount argument)
        // Using Math.round(a * 100.0) / 100.0 to round to the nearest two decimal places
        this.setEarned(Math.round(.01 * amount * 100.0) / 100.0);
    }
}
