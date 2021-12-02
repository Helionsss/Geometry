public class Main {
    public static void main(String[] args) {
        Square mySquare = new Square(new Point(3, 4), 10);
        System.out.println(mySquare.getSurface());
        System.out.println(mySquare.getPerimeter());
        System.out.println(mySquare.toString());
        System.out.println(mySquare.setColor());

        Rectangle myRectangle = new Rectangle(new Point(1, 2), 3, 4);
        System.out.println(myRectangle.getPerimeter());
        System.out.println(myRectangle.getSurface());

        Triangle myTriangle = new Triangle(new Point(0, 0), new Point(0, 5), new Point(10, 0));
        System.out.println(myTriangle.getSurface());
        System.out.println(myTriangle.isIsoceles());
        System.out.println(myTriangle.toString());

        Circle myCircle = new Circle(new Point(0, 0), 2);
        System.out.println(myCircle.getPerimeter());
        System.out.println(myCircle.getDiameter());

        Point myPoint = new Point(5, 12);
        System.out.println(myPoint.length());
    }
}