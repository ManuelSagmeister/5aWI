package MovingObjects3;

public class MoveLeft implements MoveStrategy{
    private double x,y, speed;

    public MoveLeft(double x, double y, double speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(int delta){
        this.x -= delta*speed;
    }

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }


    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
