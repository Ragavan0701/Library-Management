import java.util.*;

public class Main {
    static Scanner sr = new Scanner(System.in);
    static Books books = new Books();
    static Member member = new Member();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Register as Member");
            System.out.println("2. Login as Admin");
            System.out.println("3. View All Books");
            System.out.println("4. Borrow a Book");
            System.out.println("5. Return a Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sr.nextInt();
            sr.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    member.registerMember();
                    break;
                case 2:
                    handleAdminLogin();
                    break;
                case 3:
                    books.viewAvailableBooks();
                    break;
                case 4:
                    handleBorrowBook();
                    break;
                case 5:
                    handleReturnBook();
                    break;
                case 6:
                    System.out.println("Thank you for visiting!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void handleAdminLogin() {
        System.out.print("Enter admin password: ");
        String password = sr.nextLine();
        if (password.equals("admin123")) {
            System.out.print("Enter book title to add: ");
            String book = sr.nextLine();
            books.addBook(book);
        } else {
            System.out.println("Invalid password.");
        }
    }

    private static void handleBorrowBook() {
        System.out.print("Enter the book title to borrow: ");
        String book = sr.nextLine();
        books.borrowBook(book);
    }

    private static void handleReturnBook() {
        System.out.print("Enter the book title to return: ");
        String book = sr.nextLine();
        books.returnBook(book);
    }
}
