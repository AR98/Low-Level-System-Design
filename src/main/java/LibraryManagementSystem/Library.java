package LibraryManagementSystem;
import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();
    List<Member> members = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void addMember(Member member) {
        members.add(member);
    }

    void issueBook(int bookId, int memberId) {
        Book book = books.stream().filter(b -> b.id == bookId && !b.isIssued).findFirst().orElse(null);
        Member member = members.stream().filter(b -> b.id == memberId).findFirst().orElse(null);

        if(book != null && member !=null){
            book.isIssued = true;
            member.borrowedBooKs.add(book);
            System.out.println("Book issued: " + book.title + " to " + member.name);
        }else {
            System.out.println("Book not available or member not found!");
        }

    }

    void returnBook(int bookId, int memberId) {
        Book book = books.stream().filter(b -> b.id == bookId).findFirst().orElse(null);
        Member member = members.stream().filter(b->b.id == memberId).findFirst().orElse(null);
        if(member !=null){
            for (Book bk: member.borrowedBooKs) {
                if (bk.id == bookId) {
                    bk.isIssued = false;
                    member.borrowedBooKs.remove(bk);
                    System.out.println("Book returned: " + bk.title);
                    return;
                }
            }
        }

    }
}