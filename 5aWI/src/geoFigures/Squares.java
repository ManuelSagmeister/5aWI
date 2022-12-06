package geoFigures;

public class Squares extends Figures{

    private int length;
    public Squares(String name, int length){

        super(name);
        this.length = length;
    }

    public void getArea(){
        int a = getLength()^2;
        System.out.println("Area of Rectangle: " + a);
    }

    public int getLength() {
        return length;
    }

}