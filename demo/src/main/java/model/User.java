package model;

import java.io.IOException;

import service.BookService;

public class User {

    private int id;
    private String password;
    private String userName;
    private String email;
    private String imageUrl;
    private String createTime;
    private String updateTime;
    private StringBuilder userRegiBooks;
    private BookService bookService;

    public User() throws IOException {
        this(0, "", "", "", "", "", "", "");
    }

    public User(int id, String password, String userName, String email, String imageUrl, String createTime,
            String updateTime, String userBooks) throws IOException {
        bookService = new BookService();
        userRegiBooks = new StringBuilder();
        this.id = id;
        this.password = password;
        this.userName = userName;
        this.email = email;
        this.imageUrl = imageUrl;
        this.createTime = createTime;
        this.updateTime = updateTime;
        findUserBooks(userBooks);
    }

    private void findUserBooks(String _userBooks) throws IOException {

        for (String bookId : _userBooks.split("/")) {
            int bookKey = Integer.parseInt(bookId);
            userRegiBooks.append(bookService.userRegBooks(bookKey)).append(" / ");
        }

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public int getId() {
        return this.id;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public String getRegiBooks() {
        return userRegiBooks.toString();
    }

}
