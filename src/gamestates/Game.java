package gamestates;

import components.TestSword;
import components.Weapon;
import entities.Entity;
import entities.TestEntity;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Game extends BasicGameState {
    private final int id;
    private static GameContainer gc;

    private Entity entity = new TestEntity();
    private Weapon weapon;
    public static final Queue<Entity> entities = new ConcurrentLinkedQueue<>();

    public Game(int id) {
        this.id = id;
    }


    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        // This code happens when you enter a game state for the *first time.*
        gc.setShowFPS(true);
        this.gc = gc;
    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        weapon.render(gc);
        entities.forEach(Entity::render);
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        // This is where you put your game's logic that executes each frame that isn't about drawing
        entities.forEach(Entity::update);
    }

    public void enter(GameContainer gc, StateBasedGame sbg) throws SlickException {
        // This code happens when you enter a gameState.
        weapon = new TestSword(entity);
        entity.setPos(400, 400);
    }

    public void leave(GameContainer gc, StateBasedGame sbg) {
        // This code happens when you leave a gameState.
    }


    public void keyPressed(int key, char c) {

    }

    public void mousePressed(int button, int x, int y) {

    }


    // Returns the ID code for this game state
    public int getID() {
        return id;
    }

    public static GameContainer getGc() {
        return gc;
    }
}
