abstract class LibraryItem {
    public String title;
    public int itemID;
    public int numCopies;

    public LibraryItem(String title, int itemID, int numCopies) {
        this.title = title;
        this.itemID = itemID;
        this.numCopies = numCopies;
    }

    abstract void displayInfo();
}
