package model;

public class Book {
    private Integer id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String category;

    public Book(Integer id, String isbn, String title, String author, String publisher, String category) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
    }

    public static Book of(String line) {
        String[] fields = line.split(",");
        return new Book(Integer.parseInt(fields[0]), fields[1], fields[2], fields[3], fields[4], fields[5]);
    }

    public Integer getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getCategory() {
        return category;
    }
}