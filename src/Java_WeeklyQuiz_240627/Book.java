package Java_WeeklyQuiz_240627;

public class Book {
    private String title;
    private String author;
    private T identifier;

    public Book(String title, String author, T identifier) {
        this.title = title;
        this.author = author;
        this.identifier = identifier;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public T getIdentifier() {
        return identifier;
    }
}
