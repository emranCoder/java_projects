public class DVD extends LibraryItem {

    private final String director;

    public DVD(String title, int itemID, int numCopies, String director) {
        super(title, itemID, numCopies);
        this.director = director;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book Information:");
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Item ID: " + itemID);
        System.out.println("Number of Copies: " + numCopies);
    }
}