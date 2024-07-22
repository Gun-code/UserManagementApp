package model;

import java.io.IOException;

import service.UserService;

public class Book {
    private UserService userService;
    private int id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String category;
    private StringBuilder userKey;
    private int userCount = 0;

    public Book() throws NumberFormatException, IOException {
        this(0, "", "", "", "", "", "");
    }

    public Book(int id, String isbn, String title, String author, String publisher, String category, String userID)
            throws NumberFormatException, IOException {
        userService = new UserService();
        userKey = new StringBuilder();
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        userInfo(userID);
    }

    private void userInfo(String user) throws NumberFormatException, IOException {
        for (String userId : user.split("/")) {
            int _userKey = Integer.parseInt(userId);
            userKey.append(userService.findRegiUser(_userKey)).append(" / ");
            ++userCount;
        }

    }

    public int getId() {
        return this.id;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public String getCategory() {
        return this.category;
    }

    public int getUserCount() {
        return userCount;
    }

    public String getUserID() {
        return userKey.toString();
    }
}