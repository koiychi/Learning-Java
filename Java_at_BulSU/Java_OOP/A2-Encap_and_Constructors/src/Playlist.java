/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles J.
BSIT 2H-G1

Activity 2 - Encapsulation and Constructors
*/

import java.util.List;
import java.util.ArrayList;

public class Playlist {
    private String playlistName;
    private int createdYear;
    private List <String> songTitles;

    //SETTERS
    public void setPlaylistName(String playlistName) {
        if (playlistName.isBlank() || playlistName.equals(null)) {
            throw new IllegalArgumentException("[ERROR] Playlist name cannot be blank.");
        }
        this.playlistName = playlistName;
    }

    public void setCreatedYear(int createdYear) {
        if (createdYear < 1900 || createdYear > 2026) {
            throw new IllegalArgumentException("[ERROR] Creation year is invalid. Must be after 1900 or before next year.");
        }
        this.createdYear = createdYear;
    }


    //GETTERS
    public String getPlaylistName() {
        return playlistName;
    }

    public int getCreatedYear() {
        return createdYear;
    }

    //METHODS
    public void addSong(String song) {
        songTitles.add(song);
        System.out.println("[INFO] " + song + " is added to " + getPlaylistName());
    }

    public void removeSong(String song) {
        songTitles.remove(song);
        System.out.println("[INFO] " + song + " was removed on " + getPlaylistName());

    }

    public List <String> getSongTitles() {
        return new ArrayList<>(songTitles);
    }

    public String displayInfo() {
        return "\n[--------PLAYLIST INFO---------]\n" + "Playlist Name: " + getPlaylistName() + "\nCreated: " + getCreatedYear() + "\nSongs in this playlist: \n" + getSongTitles() + "\n-------------------------------";
    }


    // CONSTRUCTORS
    public Playlist() {
        this("Playlist Name", 2026);
    }

    public Playlist(String playlistName, int createdYear) {
        setPlaylistName(playlistName);
        setCreatedYear(createdYear);
        this.songTitles = new ArrayList<>();
    }

    public Playlist(Playlist other) {
        this(other.playlistName, other.createdYear);
        this.songTitles = new ArrayList<>(other.songTitles); 
    }
}


