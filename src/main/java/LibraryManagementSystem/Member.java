package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Member {
    int id;
    String name;
    List<Book> borrowedBooKs = new ArrayList<Book>();

    Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

}