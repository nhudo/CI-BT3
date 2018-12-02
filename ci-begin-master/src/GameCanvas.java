import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCanvas extends JPanel {
    Background background;
    Player player1;

    public GameCanvas() {
        this.setBackground(Color.blue);
        this.background = new Background();
        this.player1 = new Player();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(background.image,(int)background.position.x,(int)background.position.y, null);
        g.drawImage(player1.image,(int)player1.position.x,(int)player1.position.y,null);
    }
    public void runAll(){
        //
        this.player1.run();
        this.background.run();
    }
    public void rendAll(){

        this.repaint();//~paint
    }
    public void gameLoop(){

        long lastTimeRun =0;
        while (true){
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastTimeRun>1000/60){
                runAll();//logic game
                rendAll();// hien thi game
                lastTimeRun = currentTime;
            }
        }
    }

}