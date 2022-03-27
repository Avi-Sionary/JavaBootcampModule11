public class App {

    public static void main(String[] args) {

        Director director = new Director("Stephen Spielberg");

        Actor actor1 = new Actor("Angelina Jolie", 102.39, "Heroine");
        Actor actor2 = new Actor("Drake Bell", 89.11, "Sidekick");
        Actor[] actors = {actor1, actor2};

        Crew crew1 = new PA("Clark Kent", 16.49, 192.15);
        Crew crew2 = new Crew("Dan Green", 13.92, "Sound");
        Crew[] crew = {crew1, crew2};

        Movie movie = new Movie("Superhero", 119325, 123456, 789101, director, actors,
                crew);
        movie.calcProfit();
        movie.payDay();

        System.out.println("PA earned this much: $" + crew1.earned);

        System.out.println("Movie production cost this much: $" + movie.getMoneySpent() + " out of a budget of $" +
                movie.getBudget());

        System.out.println("Movie profit is this much: $" + movie.getProfit());

        System.out.println("Director " + movie.getDirector().name + " made this much in royalties: $" +
                movie.getDirector().earned);

    }

}
