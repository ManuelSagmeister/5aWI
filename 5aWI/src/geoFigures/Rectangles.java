package geoFigures;

public class Rectangles extends Figures{

    private int length;
    private int height;
    public Rectangles(String name, int length, int height){
        super(name);
        this.length = length;
        this.height = height;
    }

    public void getArea(){
        int a = getHeight() * getLength();
        System.out.println("Area of Square: " + a);
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
