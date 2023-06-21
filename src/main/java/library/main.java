package library;

public class main {
    public static void main(String[] args) {

        Publication pub = new Book("Ivan","War",2020);
        Publication pub1 = new Magazine("TOP",2023,201221012);
        Library library = new Library();
        library.addPublication(pub);
        library.addPublication(pub1);

        library.printPublication();
    }
}
