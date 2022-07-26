package gamestates;

import core.Main;
import org.newdawn.slick.*;
import org.newdawn.slick.imageout.ImageOut;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AdvancedGameState extends BasicGameState {
    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        Main.UI.getElements().forEach(m -> {
            m.update(gc);
            m.render(gc);
        });
    }

    @Override
    public void keyPressed(int key, char c) {
        if (key == Input.KEY_F2) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
            String dateAndTime = dateFormat.format(new Date());
            String filename = "screenshots/" + dateAndTime + ".png";
            File file = new File(filename);
            file.getParentFile().mkdirs();

            try {
                Image target = new Image(Game.getGc().getWidth(), Game.getGc().getHeight());
                Game.getGc().getGraphics().copyArea(target, 0, 0);
                ImageOut.write(target, filename);
                target.destroy();
            } catch (SlickException e) {
                throw new RuntimeException(e);
            }

            //Main.menus.add(new DialogBox(700, 400, "Screenshot", "Screenshot saved in screenshots/ folder.", new CloseButton("Got it")));
        }
//        if (key == Input.KEY_F3) {
//            Main.debug = !Main.debug;
//        }
//        if (key == Input.KEY_ESCAPE && !Main.paused) {
//            Main.menus.add(new PauseMenu());
//            Main.paused = true;
//        }
    }
}
