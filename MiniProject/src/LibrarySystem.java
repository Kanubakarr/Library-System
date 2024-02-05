import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibrarySystem {
    public static void main(String[] args) {
        // Using arrays
      Book[] booksArray = new Book[5];
        booksArray[0] = new Book("Java Programming", "John Smith");
        booksArray[1] = new Magazine("Science Today", "Various Authors", "Science");
        booksArray[2] = new Book("Data Structures", "Alice Johnson");
        booksArray[3] = new Book("C# 2nd Edition", "Simon Robinson");
        booksArray[4] = new Documentary("Man on the Run", "Leonardo Dicarprio", "2023");
        System.out.println("Using arrays:");
        for (Book book : booksArray) {
            System.out.println(book);
        }

        // Using ArrayList
        ArrayList<Book> booksList = new ArrayList<>();
        booksList.add(new Book("Java Programming", "John Smith"));
        booksList.add(new Magazine("Science Today", "Various Authors", "Science"));
        booksList.add(new Book("C# 2nd Edition", "Simon Robinson"));
        booksList.add(new Documentary("American Symphony", "Suleika Jaouad", "2023"));

        System.out.println("\nUsing ArrayList with iterators:");
        Iterator<Book> iterator = booksList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using autoboxing
        List<Integer>borrowedBookIds = new ArrayList<>();
        borrowedBookIds.add(1);// autoboxing
        borrowedBookIds.add(2);

        System.out.println("\nUsing autoboxing:");
        for (int id : borrowedBookIds) {
            System.out.println("Borrowed Book ID: " + id);
        }
    }
}

//        Book is the base class with attributes title and author.
//        Magazine is a derived class of Book with an additional attribute category.
//        Documentary is a subclass derived class of Book an additional attribute publishYear.
//        The LibrarySystem class demonstrates the use of arrays, lists, ArrayList, iterators, and autoboxing.
//        It creates an ar ray of books, a list of books, and a list of integers (representing borrowed book IDs).
//        It uses loops and iterators to display information about books and borrowed book IDs.

