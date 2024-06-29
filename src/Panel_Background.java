import javax.swing.*;
import java.awt.*;

public class Panel_Background {
    public static void main(String[] args) {
        UIManager.put("OptionPane.background", Color.black);
        UIManager.put("OptionPane.messagebackground", Color.red);
        UIManager.put("Panel.background", Color.yellow);
        JOptionPane.showMessageDialog(null, "Invalid Com Port!", "SetColor", JOptionPane.ERROR_MESSAGE);
    }
}
