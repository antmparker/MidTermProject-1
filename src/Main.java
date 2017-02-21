import java.util.Scanner;

/* Created by user on 2/21/17.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Grand Circus CD Rental");
        System.out.println();
        System.out.println("How do you want to search for CD?");
        System.out.print("Enter (1) for artist search. Enter (2) for title keyword. Enter (3) for list: ");

        int search  = scan.nextInt();
Inventory inv = new Inventory();
        if (search == 1) {
            System.out.print("Enter artist name: ");
                inv.findByArtist(scan);

        }else if (search == 2) {

            System.out.println("Enter title keyword: ");
            inv.findByTitle(scan);

        }else{
            System.out.println(inv.getAlbumInv());
        }


    }
}

