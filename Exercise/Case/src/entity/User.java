package entity;

public class User {
    private int id;
    private String userName;
    private String passWord;
    public User(int id, String userName, String passWord) {
        super();
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }

    public User(String userName, String passWord) {
        super();
        this.userName = userName;
        this.passWord = passWord;
    }
    public User(){}
    public int getId() {
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
