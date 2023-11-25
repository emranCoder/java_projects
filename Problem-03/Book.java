public class Book extends LibraryItem {

    private final String author;

    public Book(String title, int itemID, int numCopies, String author) {
        super(title, itemID, numCopies);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Item ID: " + itemID);
        System.out.println("Number of Copies: " + numCopies);
    }
}