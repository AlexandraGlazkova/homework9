public class Main {
    public static void main(String[] args) {
//    Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации. Типы полей
//    должны быть String, Author (который мы создадим  в п. 2) и int.
        String title = "Мастер и Маргарита";
        String author = "Булгаков Михаил";
        int yearPublication = 2010;
//    Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
        Book book1 = Book.Author("Булгаков", "Михаил");
        System.out.println("Фамилия - " + book1.surname +
                " Имя- "+ book1.name);
    }


}