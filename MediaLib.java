
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class MediaLib
{
    // instance variables - replace the example below with your own
    private static int numSongs;
    private int rating;
    private static int totalRating;
     //Code Snipet from the Main java file
    Song song1 = new Song("Some Random Song", 3.90, 5);
    Song song2 = new Song("Another Song", 2.75, 8);
    Song song3 = new Song("This Song....", 9.19, 10);

    /**
     * Constructor for objects of class MediaLib
     */
    public MediaLib()
    {
        // initialise instance variables

        numSongs++;
        totalRating = totalRating + rating;
        System.out.println(song1.getTitle());
        System.out.println(song1.getAvgRating());
        MediaFile.writeString(song3.getTitle() + " | " + song3.getRating());
        MediaFile.writeString(song2.getTitle() + " | " + song2.getRating());
        MediaFile.writeString(song1.getTitle() + " | " + song1.getRating());
        MediaFile.saveAndClose();
    }
}
