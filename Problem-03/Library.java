class Library {
    private final LibraryItem[] books;
    private int itemCount;

    public Library(int capacity) {
        books = new LibraryItem[capacity];
        itemCount = 0;
    }

    public void addItem(LibraryItem book) {
        if (itemCount < books.length) {
            books[itemCount] = book;
            itemCount++;
            System.out.println("Item added to the library.");
        } else {
            System.out.println("Library is full. Cannot add more items.");
        }
    }

    public void displayAllItems() {
        System.out.println("Library All Books:");
        for (LibraryItem item : books) {
            if (item != null) {
                item.displayInfo();
                System.out.println("--------------");
            }
        }
    }

    public void checkOutItem(int itemID) {
        for (LibraryItem item : books) {
            if (item != null && item.itemID == itemID) {
                if (item.numCopies > 0) {
                    item.numCopies = item.numCopies - 1;
                    System.out.println("Item checked out successfully.");
                } else {
                    System.out.println("No available copies of the item.");
                }
                return;
            }
        }
        System.out.println(itemID + " ID Book not found in the library.");
    }


}