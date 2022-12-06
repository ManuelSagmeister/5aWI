package geoFigures;


public class Circles extends Figures{

    private int radius;

    public Circles(String name, int radius){
        super(name);
        this.radius = radius;
    }

    public void getArea(){
        double a = (radius^2)*Math.PI;
        System.out.println("Area of Circle: " + a);
    }

    public int getRadius() {
        return radius;
    }
}