/**
 * Write a description of class LoopingMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{


    /**
     * Constructor for objects of class LoopingMediaLib
     */
    public static void main()
    {
        String songInfo = MediaFile.readString();
        while (songInfo != null)
        {
        int piperoni = songInfo.indexOf("|");
        String title = songInfo.substring(0, piperoni);
        String rating = songInfo.substring((piperoni + 2));
        if (Integer.parseInt(rating) > 7){
           System.out.println("Title: " + title); 
           System.out.println("Rating: " + rating);
        }
        songInfo = MediaFile.readString();
        }
        
    }
}
