package Module4.step1.topic2_Set.task2_TreeSet.subtask4_Books;

public class Book implements Comparable<Book>{
    private String title;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    private int year;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }


    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.year, o.year);
    }
}
