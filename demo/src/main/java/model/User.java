package model;

public class User {
    private Integer id;
    private String password;
    private String userName;
    private String email;
    private String imageUrl;
    private String createTime;
    private String updateTime;

    public User(Integer id, String password, String userName, String email, String imageUrl, String createTime, String updateTime) {
        this.id = id;
        this.password = password;
        this.userName = userName;
        this.email = email;
        this.imageUrl = imageUrl;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public static User of(String line) {
        String[] fields = line.split(",");
        return new User(Integer.parseInt(fields[0]), fields[1], fields[2], fields[3], fields[4], fields[5], fields[6]);
    }

    public Integer getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }
}