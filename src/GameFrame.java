import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{

    public GameFrame() {
/***
 gameWindow.setSize(800, 600); // set window size
 gameWindow.setVisible(true);    //set it to be visible
 gameWindow.setResizable(true);  //window can be resized
 gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 ***/
        this.add(new GamePanel());
        this.setTitle("THIS GAME ROCKS");
        this.setSize(800, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
