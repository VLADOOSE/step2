package step4.Book;

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book("Anna Karenina", "Lev Tolstoy", 1877);
        System.out.println(book); //сначала вызвал у book метод toString,
        // потом увидел что оно и не нужно, даже серым подсвечивалось в коде
    }
}
