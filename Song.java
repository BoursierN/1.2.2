 

/**
 * Created by Zondra on 8/25/2017.
 */

/**
 * Stores information about glorious music.
 */
public class Song
{
    // instance variables
    private static double totalCost;
    private static int numSongs;
    private static double avgPrice;
    private static double avgRating;
    private static double totalRating;
    private int rating;
    private double price;
    private String title;
    private boolean favourite;
    private int duration;

    /**
     * Constructors for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        title = ""; rating = 0; price = 0.0;
        ImNew();
    }
    public Song(String title)
    {
        this.title = title;
        ImNew();
    }
    public Song(String title, double price)
    {
        this.title = title; this.price = price;
        ImNew();
    }
    public Song(String title, double price, int rating)
    {
        this.title = title; this.price = price; this.rating = rating;
        ImNew();
    }
    public Song(String title, double price, int rating, int duration) {
        this.title = title; this.price = price; this.rating = rating; this.favourite = favourite;
        this.duration = duration;
        ImNew();
    }
    public Song(String title, double price, int rating, boolean favourite, int duration) {
        this.title = title; this.price = price; this.rating = rating; this.favourite = favourite;
        this.duration = duration;
        ImNew();
    }

    private void ImNew() //I made this little method in order to shorten the constructors.
    {
        numSongs++;
        totalRating = totalRating + rating; //step 15, calculates total rating.
        totalCost = totalCost + price; //step 12, calculates total cost.
    }

    public String getTitle(){ //getter
        return title;
    }
    public void setTitle(String title) { //setter
        this.title = title;
    }
    public int getRating(){ //getter
        return rating;
    }
    public void setRating(int rating) { //setter
        this.rating = rating;
    }
    public void setPrice(double price){ //setter
        this.price = price;
    }
    public double getPrice(){ //getter
        return price;
    }
    public void addToFavourites(){ //setter
        favourite = true;
    }
    public int getNumSongs(){ //getter
        return numSongs;
    }
    public double getAvgPrice(){ //getter, calcualtes average price, step 16
        avgPrice = (double)(Math.round((totalCost/numSongs)*100.0))/100.0;
        return avgPrice;
    }
    public double getAvgRating(){ //getter, calculates average rating, step 18
        avgRating = (double)(Math.round((totalRating/numSongs)*100.0))/100.0;
        return avgRating;
    }
    public String getDuration(){ //getter, finds duration in minutes and seconds, step 23
        int minutes = (int) (duration / 60);
        int seconds =  (int) (duration % 60);
        if (minutes == 1){ //For being grammatically correct :D
            if(minutes == 1){
                return ("Duration is 1 minute and 1 second");
            }
            return ("Duration is 1 minute and " + minutes + " seconds");
        }
        if (seconds == 1){
            return ("Duration is "+ minutes + " hours and 1 sedond");
        }
        return ("Duration is " + minutes + " hours and " + seconds + " seconds");

    }
    public void setDuration(int duration){ //setter
        this.duration = duration;
    }
}

