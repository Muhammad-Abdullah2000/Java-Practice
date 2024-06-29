import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Lab_Q extends JFrame implements ActionListener {
    JTextField c1, c2, c3;
    JButton b1, b2, b3, b4;
    Lab_Q(){
        c1 = new JTextField();
        c1.setBounds(30, 30, 100, 20);
        c2 = new JTextField();
        c2.setBounds(130, 30, 100, 20);
        c3 = new JTextField();
        c3.setBounds(50, 30, 100, 20);
        b1 = new JButton(" OpenFile ");
        b1.setBounds(30, 10, 100, 20);
        b2 = new JButton(" Open URL ");
        b2.setBounds(130,10, 100,20);
        b3 = new JButton(" Open DB ");
        b3.setBounds(230,10,100,20 );
        b4 = new JButton(" Generate ");
        b4.setBounds(330,10,100,20);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(c1);
        add(c2);
        add(c3);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args) {
    new Lab_Q();

    }
}


