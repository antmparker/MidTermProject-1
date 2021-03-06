import java.util.Scanner;

/**
 * Created by user on 2/20/17.
 */
public class Album {
    private String artist;
    private String title;
    private boolean status;
    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Album() {

        artist = "";
        title = "";
        status = true;

    }

    //setting a constructor with four arguments that matches the elements above
    //storing values in instance variables
    public Album(String artist, String title) {
        this.artist = artist;
        this.title = title;
        //this.status = status;

    }

    public Album(String artist, String title, boolean status) {

        this.artist = artist;
        this.title = title;
        this.status = status;
    }

    //Getter
    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public boolean isStatus() {
        return status;
    }

    //Setter
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //toString
    public String toString() {

        String stat = ": is on shelf";
        if (status) {
            stat = ": is checked out. Due back before or on March 8, 2017.";
        }

        return artist + " " + title + " " + stat;

    }

    public boolean checkOut(Scanner scan) {
        boolean status;
        int userInput = scan.nextInt();
        if (userInput == 1) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public boolean returnItem(Scanner scan) {
        boolean status;
        int userInput = scan.nextInt();
        if (userInput == 2) {
            status = false;
        } else {
            status = true;
        }
        return status;
    }
}

