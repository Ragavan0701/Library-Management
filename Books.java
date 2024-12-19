import java.util.ArrayList;

public class Books {
    private ArrayList<String> books = new ArrayList<>();

    public Books() {
        books.add("War and Peace by Leo Tolstoy");
        books.add("Ulysses by James Joyce");
        books.add("Utopia by Sir Thomas More");
        books.add("The Waste Land by T.S. Eliot");
        books.add("The Time Machine by H.G. Wells");
    }

    public void viewAvailableBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available Books:");
            for (String book : books) {
                System.out.println("- " + book);
            }
        }
    }

    public void addBook(String book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void borrowBook(String book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("You borrowed: " + book);
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    public void returnBook(String book) {
        books.add(book);
        System.out.println("Thank you for returning: " + book);
    }
}
