import java.lang.Math.*;
import java.util.Random;
import java.awt.Color;

public class Circle {
    Point center;
    double radius;

    Circle(Point c, double r) {
        center = c;
        radius = r;
    }

    void getSurface() {
        double s = radius * radius * Math.PI;
    }

    double getPerimeter() {
        double p;
        return p = 2 * radius * Math.PI;
    }

    double getDiameter() {
        double d;
        return d = 2 * radius;
    }

    @Override
    public String toString() {
        return "Point (x=" + center.x + "; y=" + center.y + ")";
    }

    void move(double dx, double dy) {
        center.x += dx;
        center.y += dy;
    }

    Color setColor() {
        Random r = new Random();
        return new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
    }
}