package model;

public class Book {
    int id;
    int isbn;
    String title;
    String author;
    String publisher;
    String category;
}

    public Book() {
        this(0, 0, "", "", "", "");
    }

    public Book(int id, int isbn, String title, String author, String publisher, String category) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
    }

}