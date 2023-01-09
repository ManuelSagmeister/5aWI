package MovingObjects2;

import org.newdawn.slick.*;
public class MovingObjects extends BasicGame{
    private enum Facing {
        RIGHT,
        LEFT,
        UP,
        DOWN
    }

    private CircleActor ca1;

    public MovingObjects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        this.ca1 = new CircleActor(100,100);
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        this.ca1.update(gc, delta);
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        this.ca1.render(graphics);
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
