public class Movie {

    private String genre;

    private double budget;
    private double moneySpent;
    private double moneyEarned;
    private double profit;

    private Director director;
    private Actor[] actors;
    private Crew[] crewMembers;

    public Movie(String genre, double budget, double moneySpent, double moneyEarned, Director director, Actor[] actors,
                 Crew[] crewMembers) {

        this.genre = genre;

        // Using Math.round(a * 100.0) / 100.0 for next three properties to round to the nearest two decimal places
        this.budget = Math.round(budget * 100.0) / 100.0;
        this.moneySpent = Math.round(moneySpent * 100.0) / 100.0;
        this.moneyEarned = Math.round(moneyEarned * 100.0) / 100.0;

        this.director = director;
        this.actors = actors;
        this.crewMembers = crewMembers;

    }

    public void calcProfit() { this.profit = this.budget - this.moneySpent + this.moneyEarned; }

    public void payDay() {

        double addToSpent = 0;

        this.director.getPaid(profit);
        addToSpent += director.earned;

        for (int a = 0; a < this.actors.length; a++) {
            this.actors[a].getPaid(profit);
            addToSpent += this.actors[a].earned;
        }

        for (int c = 0; c < this.crewMembers.length; c++) {
            this.crewMembers[c].getPaid(profit);
            addToSpent += this.crewMembers[c].earned;
        }

        this.moneySpent += addToSpent;

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getMoneySpent() {
        return moneySpent;
    }

    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public double getProfit() { return profit; }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Actor[] getActors() {
        return actors;
    }

    public void setActors(Actor[] actors) {
        this.actors = actors;
    }

    public Crew[] getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(Crew[] crewMembers) {
        this.crewMembers = crewMembers;
    }

}
