import javax.swing.*;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {

        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setBounds(100,20, 250,250);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(50,300,150,250);

        ImageIcon bild = new ImageIcon("bevin.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);
        JLabel label = new JLabel();
        label.setText("Tjena mannen, läget?!");
        label.setIcon(bild);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(255,182,193));
        label.setFont(new Font("MV Boli", Font.PLAIN,20));
        label.setIconTextGap(300);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(250,250,500,500);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.add(panel);
        frame.add(bluepanel);
        /*
        frame.pack();
        */

    }
}