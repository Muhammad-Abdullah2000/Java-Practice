import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Lab6 extends JFrame implements ActionListener {
    JTextField a1, a2, a3;
    JButton g1, g2;
    String [] message = {"message1", "message2", "message3"};
    JComboBox cmb = new JComboBox(message);
    Lab6() {
        a1 = new JTextField();
        a1.setBounds(50, 50, 150, 20);
        a2 = new JTextField();
        a2.setBounds(50, 100, 150, 20);
        a3 = new JTextField();
        a3.setBounds(50, 150, 150, 20);
        g1 = new JButton("+");
        g1.setBounds(50, 200, 50, 50);
        g2 = new JButton("-");
        g2.setBounds(120, 200, 50, 50);
        cmb.setBounds(250,230,80,20);
        g1.addActionListener(this);
        g2.addActionListener(this);
        cmb.addActionListener(this);
        add(cmb);
        add(a1);
        add(a2);
        add(a3);
        add(g1);
        add(g2);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String s1 = a1.getText();
        String s2 = a2.getText();
        int c = 0;
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        if(e.getSource() == cmb){
            cmb.setSelectedIndex(1);
        }
        if (e.getSource() == g1) {
            c = a + b;
        } else if (e.getSource() == g2) {
            c = a - b;
        }
        String result = String.valueOf(c);
        a3.setText(result);
    }
    public static void main(String[] args) {
        new Lab6();
    }
}


