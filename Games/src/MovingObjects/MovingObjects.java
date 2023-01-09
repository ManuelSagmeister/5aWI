package MovingObjects;

import org.newdawn.slick.*;
public class MovingObjects extends BasicGame{
    private enum Facing {
        RIGHT,
        LEFT,
        UP,
        DOWN
    }
    private float cx,cy;
    private Facing directionCircle = Facing.DOWN;
    private float rx,ry;

    private Facing directionRectangle = Facing.RIGHT;

    public MovingObjects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rx = this.cx = 100;
        this.ry = this.cy = 100;
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

        if (this.directionRectangle == Facing.RIGHT){
            this.rx += (float)i/5.0;
            if (this.rx >= 800){
                directionRectangle = Facing.LEFT;
            }
        } else if (this.directionRectangle == Facing.LEFT) {
            this.rx -= (float)i/5.0;
            if (this.rx <= 0){
                directionRectangle = Facing.RIGHT;
            }
        }

        if (this.directionCircle == Facing.DOWN){
            this.cy += (float)i/5.0;
            if (this.cy >= 800){
                directionCircle = Facing.UP;
            }
        } else if (this.directionCircle == Facing.UP) {
            this.cy -= (float)i/5.0;
            if (this.cy <= 0){
                directionCircle = Facing.DOWN;
            }
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.rx, this.ry, 50, 50);
        graphics.drawOval(this.cx, this.cy, 50, 50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer( new MovingObjects("Test"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
