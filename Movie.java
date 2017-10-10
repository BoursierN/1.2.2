 

/**
 * Created by Zondra on 8/25/2017.
 */

/**
 * Stores information about legit blockboosters
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private static double totalCost;
    private static int numMovies;
    private static double avgPrice;
    private static double avgRating;
    private static double totalRating;
    private int rating;
    private double price;
    private String title;
    private boolean favourite;
    private int duration;

    /**
     * Constructor for objects of class Movie
     */
    public Movie()
    {
        // initialise instance variables
        title = ""; rating = 0; price = 0.0;
        ImNew();
    }
    public Movie(String title)
    {
        this.title = title;
        ImNew();
    }
    public Movie(String title, double price)
    {
        this.title = title; this.price = price;
        ImNew();
    }
    public Movie(String title, double price, int rating)
    {
        this.title = title; this.price = price; this.rating = rating;
        ImNew();
    }
    public Movie(String title, double price, int rating, int duration) {
        this.title = title; this.price = price; this.rating = rating; this.favourite = favourite;
        this.duration = duration;
        ImNew();
    }
    public Movie(String title, double price, int rating, boolean favourite, int duration) {
        this.title = title; this.price = price; this.rating = rating; this.favourite = favourite;
        this.duration = duration;
        ImNew();
    }

    private void ImNew()
    {
        numMovies++;
        totalRating = totalRating + rating;
        totalCost = totalCost + price;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getRating(){
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void addToFavourites(){
        favourite = true;
    }
    public int getNumMovies(){
        return numMovies;
    }
    public double getAvgPrice(){
        avgPrice = (double)(Math.round((totalCost/numMovies)*100.0))/100.0;
        return avgPrice;
    }
    public double getAvgRating(){
        avgRating = (double)(Math.round((totalRating/numMovies)*100.0))/100.0;
        return avgRating;
    }
    public String getDuration(){
        int hours = (int) (duration / 60);
        int minutes =  (int) (duration % 60);
        if (hours == 1){
            if(minutes == 1){
                return ("Duration is 1 hour and 1 minute");
            }
            return ("Duration is 1 hour and " + minutes + " minutes");
        }
        if (minutes == 1){
            return ("Duration is "+ hours + " hours and 1 minute");
        }
            return ("Duration is " + hours + " hours and " + minutes + " minutes");

    }
    public void setDuration(int duration){
        this.duration = duration;
    }
}
