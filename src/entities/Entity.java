package entities;

import core.Main;
import org.newdawn.slick.geom.Rectangle;
import util.Vector2f;

import java.io.Serializable;
import java.util.Vector;

public abstract class Entity implements Serializable {
    protected Vector2f pos;
    protected Vector2f speed;
    protected transient Rectangle hitbox;
    protected float width;
    protected float height;

    protected Entity() {
        pos = new Vector2f(0, 0);
        speed = new Vector2f(0, 0);
        width = 1;
        height = 1;
    }

    public void init() {
        hitbox = new Rectangle(pos.x - width / 2, pos.y - height / 2, width, height);
    }

    public void update() {
        move();
        Main.entities.forEach(e -> {
           if (e.getHitbox().intersects(this.hitbox)) collide(e);
        });
    }

    public void render() {

    }

    public void move() {
        pos.add(speed);
    }

    public void collide(Entity e) {
        pos.add(e.getSpeed());
    }

    public Vector2f getPos() {
        return pos;
    }

    public Vector2f getSpeed() {
        return speed;
    }

    public Rectangle getHitbox() {
        return hitbox;
    }
}
