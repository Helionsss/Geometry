public class Point {
    double x;
    double y;

    Point(double firstX, double firstY) {
        x = this.x;
        y = this.y;
    }

    double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    void add(Point anotherPoint) {
        x += anotherPoint.x;
        y += anotherPoint.y;
    }

    void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    double distanceXTo(Point anotherPoint) {
        return x - anotherPoint.x;
    }

    double distanceYTo(Point anotherPoint) {
        return y - anotherPoint.y;
    }

    double distanceTo(Point anotherPoint) {
        return Math.sqrt((x - anotherPoint.x) * (x - anotherPoint.x) + (y - anotherPoint.y) * (y - anotherPoint.y));
    }

    @Override
    public String toString() {
        return "Point (=" + x + "; y=" + y + ")";
    }
}