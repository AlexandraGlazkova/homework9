public class Main {
    public static void main(String[] args) {
//    Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации. Типы полей
//    должны быть String, Author (который мы создадим  в п. 2) и int.

        Author author1 = new Author("Булгаков", "Михаил");
        System.out.print(author1.getSurname()+" ");
        System.out.println(author1.getName());
        Book book1 = new Book("Мастер и Маргарита", 2010);
        book1.setYearOfPublication(2005);
        System.out.println(book1.getTitle());
        System.out.println((book1.getYearOfPublication()));

        Author author2 = new Author("Достоевский", "Федор");
        System.out.print(author2.getSurname()+" ");
        System.out.print(author2.getName()+" ");
        Book book2 = new Book("Преступление и наказание", 1989);
        book1.setYearOfPublication(2001);
        System.out.print(book1.getTitle()+" ");
        System.out.print((book1.getYearOfPublication()));

    }


}