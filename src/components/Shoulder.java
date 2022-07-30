package components;

import entities.Entity;
import org.newdawn.slick.SlickException;

public abstract non-sealed class Shoulder extends Weapon {
    public static final Weapon.WeaponType type = Weapon.WeaponType.SHOULDER;

    protected Shoulder(Entity parent) throws SlickException {
        super(parent);
    }
}
