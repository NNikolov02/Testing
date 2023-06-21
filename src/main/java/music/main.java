package music;

public class main {
    public static void main(String[] args) {
        Song CallOutMyName = new Song("Call out my name","Weekend",3.54);
        Song Congratulation = new Song("Congratulation","Post Malone",4.00);
        Song Tvoi = new Song("Tvoi","Papi Hans",3.67);

        MusicLibrary Weekend = new MusicLibrary("Weekend");

        Weekend.addSong(CallOutMyName);
        Weekend.display();

        MusicLibrary Malone = new MusicLibrary("Malone");
        Malone.addSong(Congratulation);
        Malone.display();
        Weekend.removeSong(CallOutMyName);
        Weekend.display();
        Malone.SearchByArtist("Post Malone");
        Weekend.display();
    }
}
