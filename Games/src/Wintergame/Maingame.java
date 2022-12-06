package Wintergame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Maingame extends BasicGame {

    private int x,y;
    public Maingame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.y = 100;

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        this.x++;
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x,this.y, 50, 50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Maingame("Wintergame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
