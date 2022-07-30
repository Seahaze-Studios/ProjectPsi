package components;

import entities.Entity;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import util.Vector2f;

public abstract non-sealed class Sword extends Weapon {
    public static final Weapon.WeaponType type = Weapon.WeaponType.SWORD;

    protected Sword(Entity parent) throws SlickException {
        super(parent);
    }

    protected void subrender(GameContainer gc, Graphics g) {
        Image rendered = this.sprite.copy();
        rendered.setRotation((float) (new Vector2f(gc.getInput().getMouseX(), gc.getInput().getMouseY()).getTheta()));
        rendered.drawCentered(parent.getPos().x, parent.getPos().y);
    }

}
