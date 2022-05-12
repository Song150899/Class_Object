package PtB2;

public class PTB2 {
    public double a, b, c;

    public PTB2() {
    }

    public PTB2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double delta() {
        return b * b - 4 * (a * c);
    }

    public double getRoot1() {
        return (-b + Math.pow(delta(), 0.5)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.pow(delta(), 0.5)) / (2 * a);
    }

    public double x() {
        return -b / ( 2 * a);
    }
}
