package entity;

public class User {
    private final long id;
    private String userName;
    private String passWord;
    private static long count=0;

    public User(String userName, String passWord) {
        this.id = ++count;
        this.userName = userName;
        this.passWord = passWord;
    }
    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Id: " + getId() + "\nUsername: " + getUserName() + "\nPassword: " + getPassWord();
    }
}
