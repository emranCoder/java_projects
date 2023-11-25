public class Main {
    public static void main(String[] args) {
        Book book = new Book("Learn MERNStack", 101, 50, "ermanCoder");
        DVD dvd = new DVD("C/C++ Basic", 201, 30, "MD.Emran Alam");

        Library library = new Library(100);

        // Adding books to the library
        library.addItem(book);
        library.addItem(dvd);

        // Displaying information about all books in the library
        library.displayAllItems();

        // Checking out an item
        library.checkOutItem(101);

        // Displaying information about all books in the library
        library.displayAllItems();
    }
}