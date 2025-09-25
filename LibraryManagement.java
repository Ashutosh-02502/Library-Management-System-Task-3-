import java.util.*;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();

        // Sample data
        library.addBook(new Book(1, "The Alchemist", "Paulo Coelho"));
        library.addBook(new Book(2, "1984", "George Orwell"));
        library.addUser(new User(101, "Ravi Kumar"));
        library.addUser(new User(102, "Priya Sharma"));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> library.viewBooks();
                case 2 -> {
                    System.out.print("Enter Book ID to issue: ");
                    int id = sc.nextInt();
                    library.issueBook(id);
                }
                case 3 -> {
                    System.out.print("Enter Book ID to return: ");
                    int id = sc.nextInt();
                    library.returnBook(id);
                }
                case 4 -> System.out.println("Exiting system...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}
