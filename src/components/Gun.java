package components;

import entities.Entity;
import org.newdawn.slick.SlickException;

public abstract non-sealed class Gun extends Weapon {
    public static final Weapon.WeaponType type = Weapon.WeaponType.GUN;

    protected Gun(Entity parent) throws SlickException {
        super(parent);
    }
}
