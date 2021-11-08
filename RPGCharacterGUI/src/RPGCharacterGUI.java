import javax.swing.*;
import java.awt.*;


public class RPGCharacterGUI {

    JFrame frame;





    public void RPGCharacterGUI() {
        frame = new JFrame("RPG Character");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new Character();

        frame.add(panel);
        frame.setVisible(true);

    }
}
