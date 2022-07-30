package components;

import entities.Entity;
import org.newdawn.slick.SlickException;

public abstract non-sealed class Leg extends Weapon {
    public static final Weapon.WeaponType type = Weapon.WeaponType.LEG;

    protected Leg(Entity parent) throws SlickException {
        super(parent);
    }
}
