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

    private HTLCircle ca1;

    public MovingObjects(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        this.actors = new ArrayList<>();
        MoveStrategy mr1 = new MoveRight(0,0,0.3);
        MoveStrategy ml2 = new MoveLeft(600,100, 0.5);
        MoveStrategy ml3 = new MoveLeft(500, 200, 0.1);

        HTLCircle c1 = new HTLCircle(mr1);
        HTLCircle c2 = new HTLCircle(ml2);
        HTLRect r1 = new HTLRect(ml3);

        this.actors.add(c1);
        this.actors.add(c2);
        this.actors.add(r1);
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
