public class Book {
    String surname;
    String name;

    static public Book Author(String surname, String name) {
        Book author = new Book();
        author.surname = surname;
        author.name = name;
        return author;
    }
}



