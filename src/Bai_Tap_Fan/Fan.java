package Bai_Tap_Fan;

public class Fan {
    public final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
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

    @Override
    public String toString() {
        if (on==true){
        return " Thông tin quạt: "+
                "\n Mức: "+ this.speed+
                "\n radius là: "+ this.radius+
                "\nCó màu là: "+ this.color+
                "\nTrạng thái đang bật";
    }
        else {
            return " Thông tin quạt: "+
                    "\n Mức: "+ this.speed+
                    "\n radius là: "+ this.radius+
                    "\nCó màu là: "+ this.color+
                    "\nTrạng thái đang tắt";
        }

    }
}
