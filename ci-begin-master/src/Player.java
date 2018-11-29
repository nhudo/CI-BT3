import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Player {

    BufferedImage image;
    int x,y;

    public Player(){
        this.image = SpriteUtils.loadImage("assets/images/players/straight/3.png");
        this.x = 300;
        this.y = 400;
    }
    public void run(){
        if (GameWindow.isUpPress){
            this.y--;
        }
        if (GameWindow.isDowPress){
            this.y++;
        }
        if (GameWindow.isLeftPress){
            this.x--;
        }
        if (GameWindow.isRightPress){
            this.x++;
        }

    }

}
