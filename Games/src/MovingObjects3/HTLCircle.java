package MovingObjects3;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class HTLCircle extends AbstractActor{

    public HTLCircle(MoveStrategy ms) {
        super(ms);
    }

    @Override
    public void update(GameContainer gc, int delta) {

    }

    public void render(Graphics graphics){
        graphics.drawOval((float) this.ms.getX(), (float) this.ms.getY(), 20, 50);
    }
}
