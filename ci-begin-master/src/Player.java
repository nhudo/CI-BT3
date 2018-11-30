import tklibs.Mathx;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Player {

    BufferedImage image;
    int x, y;

    public Player() {
        this.image = SpriteUtils.loadImage("D:\\c# cb\\CI-BT2\\ci-begin-master\\assets\\images\\players\\straight\\0.png");
        this.x = 300;
        this.y = 400;
    }

    public void run() {
        if (GameWindow.isUpPress) {
            this.y--;
        }
        if (GameWindow.isDowPress) {
            this.y++;
        }
        if (GameWindow.isLeftPress) {
            this.x--;
        }
        if (GameWindow.isRightPress) {
            this.x++;
        }

    }
//    private  void  limitPlayerPosition(){
//       // limit x [0,Background.image.width]
//        this.x = Mathx.clamp(this.x,0,384-32);
//        //limit y [0,Screen.height]s
//        this.y = Mathx.clamp(this.y,0,600-48);
//   }
}