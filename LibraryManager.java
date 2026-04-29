import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<User> users;
    private ArrayList<Book> books;

    public LibraryManager() {
        users = new ArrayList<>();
        books = new ArrayList<>();
    }

    public void addUser(String name) {
        users.add(new User(name));
        System.out.println("User added.");
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added.");
    }

    public void showBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + ": " + books.get(i));
        }
    }

    public void showUsers() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(i + ": " + users.get(i).getName());
        }
    }

    public void borrowBook(int userIndex, int bookIndex) {
        Book book = books.get(bookIndex);
        User user = users.get(userIndex);

        if (book.isAvailable()) {
            book.borrowBook();
            user.borrowBook(book);
            System.out.println("Book borrowed.");
        } else {
            System.out.println("Book not available.");
        }
    }

    public void returnBook(int userIndex, int bookIndex) {
        Book book = books.get(bookIndex);
        User user = users.get(userIndex);

        book.returnBook();
        user.returnBook(book);
        System.out.println("Book returned.");
    }
}