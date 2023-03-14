public class Fan {
    private int speed = 1;
    private boolean on=false;
    private double radius=5;
    private String color="blue";

    public Fan() {
    }

    @Override
    public String toString() {
            return "fan is "+(on?"on và Quạt đang chạy với tốc độ "+speed:"off")+" với màu "+color+" với bán kính "+radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}