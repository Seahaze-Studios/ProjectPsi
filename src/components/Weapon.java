package components;

import entities.Entity;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public abstract sealed class Weapon extends Component permits Sword, Gun, Shoulder, Leg {

    protected Weapon(Entity parent) throws SlickException {
        super(parent);
    }

    public enum WeaponType {
        NONE("Weapon"),
        SWORD("Sword"),
        GUN("Gun"),
        SHOULDER("Shoulder"),
        LEG("Leg");

        String name;
        WeaponType(String name) {
            this.name = name;
        }
    }

    public static final WeaponType type = WeaponType.NONE;

}
