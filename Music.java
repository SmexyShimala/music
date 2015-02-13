public class Music

//Class to keep track of music
//February 13, 2015

  String album;
  String artist;
  String genre;
  String media;
  String location;
  int copies;

/*------------------------*/
  
  Music {
    album = "No Album";
    artist = "No Artist";
    genre = "No Genre";
    media = "No Media";
    location = "None";
    copies = 0;
  }
  
  public String toString() {
    String output = "";
    output = "Album: "+ album + "Artist: " + artist + "Genre: " + genre + "Media: " + media + "Location: " + location + "Copies: " + copies
    return output;
  }
