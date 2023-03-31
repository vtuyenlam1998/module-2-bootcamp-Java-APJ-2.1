package model.abstraction;

public abstract class User {
    private String userName;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String passWord;
    private String address;

    public User() {
    }

    protected User(String userName, String fullName, String phoneNumber, String email, String passWord, String address) {
        this.userName = userName;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.passWord = passWord;
        this.email = email;
        this.address = address;
    }

    protected User(String fullName, String phoneNumber, String email, String address) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    protected User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "THÔNG TIN NGƯỜI DÙNG: "
                + "\n" + "- Tên họ đầy đủ: " + fullName
                + "\n" + "- Số điện thoại: " + phoneNumber
                + "\n" + "- Email: " + email
                + "\n" + "- Địa chỉ nhà: " + address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
