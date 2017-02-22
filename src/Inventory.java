import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 2/20/17.
 */
public class Inventory {
    private ArrayList<Album> albumInv;

    public Inventory() {
        albumInv = new ArrayList<Album>();
        //Album album = new Album();

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

    public String getAlbumInv() {
        String output = "";
        int count = 1;
        for (Album a : albumInv) {

            output = output + count + ": " + a.toString() + "\n";
            count++;
        }

        return output;
    }

    public Album getAlbum(int index) {
        return albumInv.get(index);

    }

    public Album findByArtist(Scanner scan) {
        boolean found = false;
        String artistName = scan.nextLine();
        Album album = null;
        for (int i = 0; !found && i < albumInv.size(); i++) {
            if (artistName.equalsIgnoreCase(albumInv.get(i).getArtist())) {
                found = true;
                album = albumInv.get(i);
            }
        }
        // let user know that name wasn't on the list
        if (!found) {
            System.out.println("Sorry we don't have that artist.");
        }
        return album;


    }

    public Album findByTitle(Scanner scan) {
        boolean found = false;
        String albumTitle = scan.nextLine();
        Album album = null;
        for (int i = 0; !found && i < albumInv.size(); i++) {
            if (albumTitle.equalsIgnoreCase(albumInv.get(i).getTitle())) {
                found = true;
                album = albumInv.get(i);
            }
        }

        if (!found) {
            System.out.println("Sorry we don't have that title.");
        }
        return album;


    }


}
