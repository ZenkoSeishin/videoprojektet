import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("Adem är bäst"); //skriver titeln
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);//ingen kan ändra den
        this.setSize(1920,1080); //sets the x dimension and y dimension
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("bevin.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(255,182,193));
    }
}
