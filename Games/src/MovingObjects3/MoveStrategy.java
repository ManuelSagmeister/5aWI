package MovingObjects3;

public interface MoveStrategy {
    public double getX();
    public double getY();
    public void update(int delta);
}
