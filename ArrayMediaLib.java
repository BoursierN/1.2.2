/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class ArrayMediaLib
{
    // instance variables - replace the example below with your own
    private static int numSongs;
    private int rating;
    private static int totalRating;
     //Code Snipet from the Main java file
    String[] sharingFriends = {"Jamal", "Emily", "Destiny", "Mateo", "Sharkeisha"};
    int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
    
    Song[] topTenSongs = {new Song("The Twist"),
                          new Song("Smooth"),
                          new Song("Mack The Knife"),
                          new Song("How do I Live"),
                          new Song("Party Rock Anthem"),
                          new Song("I Gotta Feeling"),
                          new Song("Macarena"),
                          new Song("Physical"),
                          new Song("You Light Up My Life"),
                          new Song("Hey Jude"),
    };
    /**
     * Constructor for objects of class MediaLib
     */
    public ArrayMediaLib()
    {
        // initialise instance variables
        /*
        for (int i = 0; i < sharingFriends.length; i++)
        {
            System.out.println(sharingFriends[i]);
        }
        */
        System.out.println("-BEFORE--");
        for (Song printSong : topTenSongs) {
            System.out.println(printSong.getTitle());
        }
        /*
        for (Song changeSong : topTenSongs) {
           changeSong.setPrice(1.29);
        }
        */
       for (int i = 0; i < topTenSongs.length; i++)
        {
            if (i%3 == 0) {
                topTenSongs[i].setPrice(0.99);
            }
            else {
                topTenSongs[i].setPrice(1.29);
            }
        }
        System.out.println("-AFTER--");
        for (Song showSong : topTenSongs) {
            System.out.println(showSong.getTitle() + " | " + showSong.getRating());
        }   
        
    }
}
