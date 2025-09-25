import java.util.*;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user);
    }

    public void viewBooks() {
        System.out.println("\n--- Book List ---");
        for (Book b : books) System.out.println(b);
    }

    public void issueBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId && !b.isIssued()) {
                b.issueBook();
                System.out.println("Book issued: " + b.getTitle());
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId && b.isIssued()) {
                b.returnBook();
                System.out.println("Book returned: " + b.getTitle());
                return;
            }
        }
        System.out.println("Invalid return attempt.");
    }
}
