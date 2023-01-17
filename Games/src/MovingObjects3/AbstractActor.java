package MovingObjects3;

import org.newdawn.slick.GameContainer;

public abstract class AbstractActor implements Actor{

protected MoveStrategy ms;

public AbstractActor(MoveStrategy ms) {
        this.ms = ms;
        }

    @Override
    public void update(GameContainer gc, int delta) {
        ms.update(delta);
    }
}
