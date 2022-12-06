package geoFigures;

public class Main {
    public static void main(String[] args) {
        Figures r1 = new Rectangles("rectangle1", 10, 9);
        Figures c1 = new Circles("circle1", 8);
        Figures s1 = new Squares("square1", 69);

        r1.getArea();
        c1.getArea();
        s1.getArea();
    }
}
