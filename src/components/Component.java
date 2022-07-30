package components;

import entities.Entity;
import org.newdawn.slick.*;

public abstract class Component {
    protected Image sprite;
    protected SpriteSheet sheet;
    protected Entity parent;

    protected int frame;

    protected Component(Entity parent) throws SlickException {
        this.parent = parent;
        frame = 0;
    }

    public void render(GameContainer gc) {
        Graphics g = gc.getGraphics();
        subrender(gc, g);
    }

    public void update(GameContainer gc) {
        
    }

    protected abstract void subrender(GameContainer gc, Graphics g);
}
