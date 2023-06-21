package music;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

@Data
@Builder
@AllArgsConstructor
public class MusicLibrary {

    String name;

    ArrayList<Song> songs= new ArrayList<>();

    public MusicLibrary(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song){
        songs.add(song);
    }
    public void removeSong(Song song){
        songs.remove(song);
    }

    public ArrayList<Song> SearchByArtist(String artist){
        ArrayList<Song> result = new ArrayList<>();
        for(Song song1:songs){
            if(song1.getArtist().equalsIgnoreCase(artist)){
                result.add(song1);
            }
        }
        return result;
    }

    public  void display(){
        System.out.println("Music Library:");
        for(Song song1:songs){
            System.out.println(song1);
        }
    }
}
