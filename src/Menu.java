import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 2/21/17.
 */
public class Menu {

    //method to find by Artist
    public Album findByArtist (Scanner artist) {
        artist = artist.nextLine();
        boolean found= false;
        for (int i = 0; !found && i < albumInv.size(); i++) {
            if (artist.equals(albumInv.get(i))) {
                boolean found = true;
                artist = albumInv.get(i);
            }
        }
        // let user know that name wasn't on the list
        if (!found) {
            System.out.println("Sorry we don't have that artist.");
        }
        return artist;
    }

////find by title
//    public static Album findByTitle (Scanner title) {
//        boolean found = false;
//        Album album;
//        album = title.next()
//        for (int i = 0; !found && i < albumInv.size(); i++) {
//            if (title.equals(albumInv.get(i))) {
//                found = true;
//                title = albumInv.get(i);
//            }
//        }
//        if (!found) {
//            System.out.println("Sorry we don't have that artist.");
//        }
//        return album;
//    }
    //displayInventory
    public static ArrayList displayInventory (ArrayList inventory){

        return inventory;
    }
    public static int checkoutAlbum (int album){
        return album;

    }
    public static Album returnAlbum (Album album){
        return album;
    }
}
