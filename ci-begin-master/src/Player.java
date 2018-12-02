import tklibs.Mathx;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Player {

    BufferedImage image;
    Vector2D position;

    public Player() {
        this.image = SpriteUtils.loadImage("D:\\IntelliJ\\CI-BT2\\ci-begin-master\\assets\\images\\players\\straight\\1.png");
//        this.x = 300;
//        this.y = 400;
        this.position = new Vector2D(200,300);
    }

    public void run() {
        if (GameWindow.isUpPress) {
//            this.y--;
            this.position.addThis(0,-1);
        }
        if (GameWindow.isDowPress) {
//
            this.position.addThis(0,1);
        }
        if (GameWindow.isLeftPress) {
//            this.x--;
            this.position.addThis(-1,0);
        }
        if (GameWindow.isRightPress) {
//            this.x++;
            this.position.addThis(1,0);
        }

    }
    private  void  limitPlayerPosition(){
//        limit x [0,Background.image.width]
//        this.x = Mathx.clamp(this.x,0,384-32);
        float x = (float)Mathx.clamp(this.position.x,0,384-32);
//         limit y [0,Screen.height]s
//        this.y = Mathx.clamp(this.y,0,600-48);
        float y = (float)Mathx.clamp(this.position.y,0,600-48);
         this.position.set(x,y);

   }
}