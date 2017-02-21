/**
 * Created by user on 2/20/17.
 */
public class Album {
        private String artist;
        private String title;
        private boolean status;

        public Album () {

            artist = "";
            title = "";
            status = true;

        }
        //setting a constructor with four arguments that matches the elements above
        //storing values in instance variables
        public Album (String artist, String title) {
            this.artist = artist;
            this.title = title;
            this.status = status;

        }

        public Album (String artist, String title, boolean status) {

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
        public String toString () {
            return artist + title + status;
        }
    }


