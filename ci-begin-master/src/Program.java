import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class Program {

    public static void main(String[] args) {
        GameWindow gw = new GameWindow();
        GameCanvas gc = new GameCanvas();

        gc.setPreferredSize(new Dimension(800,600));
        gw.add(gc);
        gw.pack();
        gw.setVisible(true);
        gc.gameLoop();

    }
}
