import javax.swing.*;
import java.awt.*;
public class Gui {
    public static void main(String[] args) {
        UIManager um = new UIManager();
        um.put("OptionPane.messageForeground", Color.white);
        um.put("Panel.background", Color.black);
        JOptionPane.showMessageDialog(null,"Hello","Set Color",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
