package MovingObjects3;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MovingObjects extends BasicGame{
    private enum Facing {
        RIGHT,
        LEFT,
        UP,
        DOWN
    }

    private List<Actor> actors;

    private CircleActor ca1;

    public MovingObjects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        this.actors = new ArrayList<>();
        this.actors.add(new CircleActor(100,100));
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for (Actor actor : this.actors){
            actor.update(gc, delta);
        }
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors){
            actor.render(graphics);
        }
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
