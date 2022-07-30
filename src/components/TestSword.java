package components;

import entities.Entity;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class TestSword extends Sword {

    public TestSword(Entity parent) throws SlickException {
        super(parent);
        this.sprite = new Image("/res/dev/placeholder.png");
    }
}
