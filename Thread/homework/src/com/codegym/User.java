package com.codegym;

public class User implements Runnable {
    private Thread t;
    private final String email;
    private final long timeResponse;

    public User(String email, long timeResponse) {
        this.email = email;
        this.timeResponse = timeResponse;
    }
    public long getTimeResponse() {
        return timeResponse;
    }

    @Override
    public void run() {
        try {
            System.out.println("Email: " + email + " đang gửi....");
            Thread.sleep(getTimeResponse());
            System.out.println("Email: " + email + " gửi thành công");
        } catch (InterruptedException e) {
            System.out.println("Email bị lỗi");
        }
    }
    public void start() {
        if(t == null) {
            t = new Thread(this,email);
            t.start();
        }
    }
}
