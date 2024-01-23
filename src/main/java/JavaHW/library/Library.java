package JavaHW.library;

public class Library {
    public static void main(String[] args) {
        Author author = new Author("Paulo Coelho", "paulo.coelhog@gmail.com");

        Book book = new Book("The Alchemist", 1988, author, 29.50);

        System.out.println("Book " + book.getName() + " (" + book.getPrice() + " RON), by " +
                book.getAuthor().getName() + ", published in " + book.getYear());
    }
}