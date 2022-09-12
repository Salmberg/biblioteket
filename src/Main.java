import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Välkommen till biblioteket, vad vill du låna?");
        welcomeMenu();
    }


    static void welcomeMenu() {

        System.out.println("====================");
        System.out.println("1.Add a book to the library");
        System.out.println("2.Search for a book by name");
        System.out.println("3. List all books by name");
        System.out.println("4. Return a book");
        System.out.println("5.Quit");


        Scanner sc = new Scanner(System.in);
        String chosenNumber = sc.nextLine();



        book b1 = new book("Sagan om ringen", "Tolkien", 2000, "Första utgåvan");
        book b2 = new book("The Hobbit", "Tolkien", 2001, "Första utgåvan");
        book b3 = new book("The Hobbit", "Tolkien", 2001, "Första utgåvan");
        book b4 = new book("The Hobbit", "Tolkien", 2001, "Första utgåvan");


        b1.loan();
        b1.returnBook();


        ArrayList<book> books = new ArrayList<>();

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        for (book book : books) {
            System.out.println(book);


        }
    }
}


