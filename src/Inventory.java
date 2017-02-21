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

            albumInv.add new Album("Michael Jackson", "Thriller");
            albumInv.add new Album("Nelly Furtado", "Loose");
            albumInv.add new Album("Backstreet Boys", "Millennium");
            albumInv.add new Album("Sia", "Chandelier");
            albumInv.add new Album("James Brown", "The Payback");
            albumInv.add new Album("Rihanna", "Talk That Talk");
            albumInv.add new Album("Black Eyed Peas", "The E.N.D.");
            albumInv.add new Album("Run D.M.C.", "Walk This Way");
            albumInv.add new Album("Justin Bieber", "Purpose");
            albumInv.add new Album("Aretha Franklin", "Respect");
            albumInv.add new Album("Pitbull", "Globalization")
            albumInv.add new Album("David Guetta", "Listen");

        }
}
