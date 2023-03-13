package Virtual_Library;

import java.util.HashMap;
import java.util.Map;

public class BookDatabase {
    private static BookDatabase instance;
    private Map<Integer, String> books;
    private int BookID = 1;

    private BookDatabase() {
        books = new HashMap<>();
    }

    public static BookDatabase getInstance() {
        if(instance == null) {
            instance = new BookDatabase();
        }
        return instance;
    }
    // Adding books, also if already exists.
    public void addBook(String title) {
        boolean bookExist = books.containsValue(title);
        if (bookExist) {
            System.out.println("\nThe Book" + title + " already exist on our database.\n");
        } else {
            books.put(BookID++, title);
            System.out.println("\nThe Book" + title + " is been added on our database.\n");
        }
    }
    //Removing books on database
    public void removeBook(int title) {
        String value = books.remove(title);
        if (value == null) {
            System.out.println("\nInvalid Book ID.");
        } else {
            System.out.println("\nThe Book " + value + " is been removed on our database.\n");
        }
    }
    // View list of books
    public void viewBooks() {
        System.out.println("\n======= LIST OF BOOKS =======");
        if(books.isEmpty()){
            System.out.println("\n\n  ==== No Books Found ====");
        } else {
            for( Map.Entry<Integer, String> entry : books.entrySet() ){
                System.out.println("Book ID: " + entry.getKey() + " = Book Name: " + entry.getValue());
            }
        }
    }
}