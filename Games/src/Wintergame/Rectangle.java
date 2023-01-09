package Wintergame;

import org.newdawn.slick.*;

public class Rectangle extends BasicGame {

    private float x,y;
    public Rectangle(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.y = 100;

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        this.x += (float)i/10.0;
        this.y += (float)i/10.0;

        if(this.x>800){
            this.x=0;
            this.y=0;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect((float) this.x, (float) this.y, 50, 50);

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangle("Wintergame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
