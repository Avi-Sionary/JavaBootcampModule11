import java.text.NumberFormat; // Using this to format the dollar amounts (i.e., add commas)

public class App {

    public static String formatDollarAmount(double amount) { // Helper method to make money amounts more readable

        NumberFormat commas = NumberFormat.getInstance(); // New instance of a NumberFormat
        commas.setGroupingUsed(true); // Puts commas after every group of 3

        String formattedAmt = commas.format(amount);
        return formattedAmt;
    }

    public static void main(String[] args) {

        // Info is for Jurassic World: Fallen Kingdom. I never actually saw this movie so don't ask why I picked it

        Director director = new Director("J. A. Bayona");

        Actor actor1 = new Actor("Chris Pratt", 10000000, "Owen Grady");
        Actor actor2 = new Actor("Bryce Dallas Howard", 8000000, "Claire Dearing");
        Actor[] actors = {actor1, actor2};

        Crew crew1 = new PA("Clark Kent", 16.49, 192.15);
        Crew crew2 = new Crew("Dan Green", 13.92, "Sound");
        Crew[] crew = {crew1, crew2};

        Movie movie = new Movie("SciFi Action", 187000000, 170000000, 1310000000,
                director, actors, crew);

        movie.payDay();

        System.out.println("PA earned this much: $" + formatDollarAmount(crew1.earned));

        System.out.println("Movie production cost this much: $" + formatDollarAmount(movie.getMoneySpent()) +
                " out of a budget of $" + formatDollarAmount(movie.getBudget()));

        System.out.println("Movie profit is this much: $" + formatDollarAmount(movie.getProfit()));

        System.out.println("Director " + movie.getDirector().name + " made this much in royalties: $" +
                formatDollarAmount(movie.getDirector().earned));

    }

}
