import javax.swing.*;
import java.util.Scanner;
import javax.swing.*;

public class Program {

    public static void main(String[] args) {
        GameWindow gw = new GameWindow();
        GameCanvas gc = new GameCanvas();

        gw.add(gc);
        gw.setVisible(true);
        gc.gameLoop();

    }
}
