package lab4;

public class Circle {
    Point center;
    double radius;

    public Circle(Point p, double radius) {
        this.center = p;
        this.radius = radius;
    }

    public area() {
        return Math.PI*radius*radius;
    }

    public circumference() {
        return 2*Math.PI*radius;
    }

    public void moveCenter(double x, double y) {
        this.center.x = x;
        this.center.y = y;
    }

    public boolean isCircle() {
        return radius > 0;
    }
    
    public boolean isContained(Point p) {
        return p.distance(center) <= radius;
    }
}