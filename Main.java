import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();

        while (true) {
            System.out.println("\n1. Add User");
            System.out.println("2. Add Book");
            System.out.println("3. Show Books");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Show Users");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter user name: ");
                    String name = scanner.nextLine();
                    manager.addUser(name);
                    break;

                case 2:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    manager.addBook(title, author);
                    break;

                case 3:
                    manager.showBooks();
                    break;

                case 4:
                    manager.showUsers();
                    System.out.print("User index: ");
                    int uIndex = scanner.nextInt();
                    manager.showBooks();
                    System.out.print("Book index: ");
                    int bIndex = scanner.nextInt();
                    manager.borrowBook(uIndex, bIndex);
                    break;

                case 5:
                    manager.showUsers();
                    System.out.print("User index: ");
                    uIndex = scanner.nextInt();
                    manager.showBooks();
                    System.out.print("Book index: ");
                    bIndex = scanner.nextInt();
                    manager.returnBook(uIndex, bIndex);
                    break;

                case 6:
                    manager.showUsers();
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}