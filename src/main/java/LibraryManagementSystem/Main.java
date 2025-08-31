package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        // Add books
        lib.addBook(new Book(1, "Harry Potter", "J.K. Rowling"));
        lib.addBook(new Book(2, "The Hobbit", "J.R.R. Tolkien"));

        // Add members
        lib.addMember(new Member(1, "Alice"));
        lib.addMember(new Member(2, "Bob"));

        // Issue and return flow
        lib.issueBook(1, 1);  // Harry Potter → Alice
        lib.issueBook(1, 2);
        lib.returnBook(1, 1); // Alice returns Harry Potter
    }
}