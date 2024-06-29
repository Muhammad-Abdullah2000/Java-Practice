import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Combo_Box extends JFrame implements ActionListener {

    String [] message = { "User","Admin"};
    JComboBox cmb = new JComboBox(message);
    JCheckBox checkbox = new JCheckBox();

    Combo_Box(){
        checkbox.setText("Are you ok?");
        checkbox.setFocusable(false);
        add(checkbox);
        checkbox.setBounds(220,280,100,30);
        cmb.setBounds(230,200,100,25);
        add(cmb);
        cmb.addActionListener(this);
        checkbox.addActionListener(this);
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cmb) {
            cmb.setSelectedIndex(1);
        }
        if (e.getSource()==checkbox){
            checkbox.isSelected();
        }
    }
    public static void main(String[] args) {

        new Combo_Box();
    }
}
