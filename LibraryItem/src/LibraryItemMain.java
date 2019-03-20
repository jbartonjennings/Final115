
public class LibraryItemMain {
public static void main(String[] args) {
        LibraryItem[] e = { new Magazine(),   new DVD(), 
                         new CD(), new Book() };

        for (int i = 0; i < e.length; i++) {
            
            e[i].itemNumber();
            e[i].itemTitle();
            e[i].checkIn();
            e[i].checkOut();
            System.out.println();
        }
    }
}
