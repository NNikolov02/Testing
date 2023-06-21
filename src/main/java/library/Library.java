package library;

import java.util.ArrayList;

public class Library {

    private static ArrayList<Publication> lib = new ArrayList<>();

    public void addPublication(Publication publication){
        lib.add(publication);
    }
    public  void printPublication(){
        System.out.println("All Publication:");
        for(Publication pubs:lib){
            System.out.println(pubs);
        }
    }
}
