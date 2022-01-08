import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component.*;

public class Game{

    int x = 0; //Horizontal position of rectangle
    int velx = 1; //Speed of rectange
    Graphics g;



    public static void main(String[] args) {

        GameFrame window = new GameFrame();


        /**
        add background color to our game window by creating a panel and setting the background color
        JPanel gamePanel = new JPanel();
        gamePanel.setBackground(Color.darkGray);
        gameWindow.add(gamePanel);

***/

        while(true){
            window.getGraphics();

            try {
                Thread.sleep(16);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void paintComponent (Graphics g){
        g.setColor(Color.PINK);
        g.fillRect(0,30,50,30);
    }

    public void animate(Graphics g){
        this.x += this.velx;
    }

}
