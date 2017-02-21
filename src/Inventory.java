import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 2/20/17.
 */
public class Inventory {
    private ArrayList<Album> albumInv;

    public Inventory() {
        albumInv = new ArrayList<Album>();

        albumInv.add(new Album("Michael Jackson", "Thriller"));
        albumInv.add(new Album("Nelly Furtado", "Loose"));
        albumInv.add(new Album("Backstreet Boys", "Millennium"));
        albumInv.add(new Album("Sia", "Chandelier"));
        albumInv.add(new Album("James Brown", "The Payback"));
        albumInv.add(new Album("Rihanna", "Talk That Talk"));
        albumInv.add(new Album("Black Eyed Peas", "The E.N.D."));
        albumInv.add(new Album("Run D.M.C.", "Walk This Way"));
        albumInv.add(new Album("Justin Bieber", "Purpose"));
        albumInv.add(new Album("Aretha Franklin", "Respect"));
        albumInv.add(new Album("Pitbull", "Globalization"));
        albumInv.add(new Album("David Guetta", "Listen"));
    }

    public ArrayList<Album> getAlbumInv() {
        return albumInv;
    }

    public Album getAlbum(int index) {
        return albumInv.get(index);

    }
    public Album findByArtist (Scanner artist) {
        boolean found = false;
        String artistName = artist.nextLine();
        for (int i = 0; !found && i < albumInv.size(); i++) {
            if (artist.equals(albumInv.get(i))) {
                found = true;
                artistName = albumInv.get(i);
            }
        }
        // let user know that name wasn't on the list
        if (!found) {
            System.out.println("Sorry we don't have that artist.");
        }
        return artistName;
    }

}
