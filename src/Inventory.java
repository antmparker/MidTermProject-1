/**
 * Created by user on 2/20/17.
 */
public class Inventory {
  public ArrayList<Inventory> getAlbumInv() {
        return albumInv;
    }

    public Inventory(ArrayList<Inventory> albumInv) {

        this.albumInv = albumInv;
    }

    ArrayList<Inventory> albumInv = new ArrrayList<Inventory>();

            albumInv.add new Album("Michael Jackson", "Thriller", "Vinyl");
            albumInv.add new Album("Nelly Furtado", "Loose", "CD");
            albumInv.add new Album("Backstreet Boys", "Millennium", "CD");
            albumInv.add new Album("Sia", "Chandelier", "CD");
            albumInv.add new Album("James Brown", "The Payback", "Vinyl");
            albumInv.add new Album("Rihanna", "Talk That Talk", "CD");
            albumInv.add new Album("Black Eyed Peas", "The E.N.D.", "CD");
            albumInv.add new Album("Run D.M.C.", "Walk This Way", "Vinyl");
            albumInv.add new Album("Justin Bieber", "Purpose", "CD");
            albumInv.add new Album("Aretha Franklin", "Respect", "Vinyl");
            albumInv.add new Album("Pitbull", "Globalization", "CD")
            albumInv.add new Album("David Guetta", "Listen", "CD");

        }
}
