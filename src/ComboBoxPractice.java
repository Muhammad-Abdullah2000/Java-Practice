import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
public class ComboBoxPractice extends JFrame implements ActionListener {
    String[] comboBoxItems = {"Message 1", "Message 2", "Message 3"};
    JComboBox msgComboBox = new JComboBox(comboBoxItems);
    JPanel imagePanel = new JPanel();
    ComboBoxPractice(){
        try {
            BufferedImage myPicture = ImageIO.read(new File("C:\\Users\\HAIER\\OneDrive\\Desktop\\PNG File.png"));
            JLabel picLabel = new JLabel(new ImageIcon());
            imagePanel.add(picLabel);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        imagePanel.setBounds(0,0,1000,500);
        add(imagePanel);

        //msgComboBox.setBounds(200, 200, 100, 25);
        //add(msgComboBox);
        msgComboBox.addActionListener(this);

        setSize(1000, 500);
        setLayout(null);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == msgComboBox) {
            String selectedItem = msgComboBox.getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, selectedItem);
        }
    }

    public static void main(String[] args) {

        new ComboBoxPractice();
    }
}