import java.util.Scanner;

/* Created by user on 2/21/17.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Grand Circus CD Rental");
        System.out.println("*************************************" +
                "");

        do {
            System.out.println();
            System.out.println("How do you want to search for CD?");
            //System.out.print("Enter (1) for artist search. Enter (2) for title keyword. Enter (3) for list: ");

            int search;
            search = Validator.getInt(scan, "Enter (1) for artist search. Enter (2) for title keyword. Enter (3) for list: ",
                    1, 3);
            Inventory inv = new Inventory();

            if (search == 1) {
                System.out.print("Enter artist name: ");
                Album ans = inv.findByArtist(scan);
                if(ans != null){
                    System.out.println((ans.getIndex() + 1) + ": " + ans.toString());
                }


            } else if (search == 2) {

                //System.out.println("Enter title keyword: ");
                Album ans = inv.findByTitle(scan);

                if(ans != null){
                    System.out.println((ans.getIndex() + 1) + ": " + ans.toString());
                }
            } else {
                System.out.println(inv.getAlbumInv());
            }
            //allows user to select an item to checkout or return
            int index = Validator.getInt(scan, "Select the album you want to checkout or return. ",
                    1, 12);
            System.out.println(inv.getAlbum(index - 1));
            int selectedItem = index - 1;



            int find = Validator.getInt(scan, "Enter (1) to checkout. Enter (2) to return. ", 1, 2);
            if (find == 1) {
                inv.getAlbum(selectedItem).setStatus(true);
                System.out.println(inv.getAlbum(selectedItem));

            } else if (find == 2) {
                inv.getAlbum(selectedItem).setStatus(false);
                System.out.println(inv.getAlbum(selectedItem));
            }
        } while (true);


    }
}

