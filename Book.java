 

/**
 * Created by Zondra on 8/25/2017.
 */

/**
 * Stores information about good reads.
 */
public class Book
{
    // instance variables
    private static double totalCost;
    private static int numBooks;
    private static double avgPrice;
    private static double avgRating;
    private static double totalRating;
    private int rating;
    private double price;
    private String title;
    private boolean favourite;

    /**
     * Constructor for objects of class Song
     */

    public Book()
    {
        // initialise instance variables
        title = ""; rating = 0; price = 0.0;
        ImNew();
    }
    public Book(String title)
    {
        this.title = title;
        ImNew();
    }
    public Book(String title, double price)
    {
        this.title = title; this.price = price;
        ImNew();
    }
    public Book(String title, boolean favourite)
    {
        this.title = title; this.favourite = favourite;
        ImNew();
    }
    public Book(String title, double price, int rating)
    {
        this.title = title; this.price = price; this.rating = rating;
        ImNew();
    }
    public Book(String title, double price, boolean favourite) {
        this.title = title; this.price = price; this.favourite = favourite;
        ImNew();
    }
    public Book(String title, double price, int rating, boolean favourite) {
        this.title = title; this.price = price; this.rating = rating; this.favourite = favourite;
        ImNew();
    }

    private void ImNew()
    {
        numBooks++;
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
    public int getNumSongs(){
        return numBooks;
    }
    public double getAvgPrice(){
        avgPrice = (double)(Math.round((totalCost/numBooks)*100.0))/100.0;
        return avgPrice;
    }
    public double getAvgRating(){
        avgRating = (double)(Math.round((totalRating/numBooks)*100.0))/100.0;
        return avgRating;
    }
}

