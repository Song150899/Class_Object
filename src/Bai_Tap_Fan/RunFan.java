package Bai_Tap_Fan;

public class RunFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("Đối tượng Fan 1: \n "+fan1);

        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.getColor();
        fan2.isOn();
        System.out.println("Đối tượng Fan 2: \n "+fan2);
    }

}
