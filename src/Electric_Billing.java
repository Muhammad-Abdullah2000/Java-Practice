import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Electric_Billing extends JFrame implements ActionListener{
    JTextField tf1,  tf3;
    JButton b1;
    JLabel c1;
    Electric_Billing() {
        c1 = new JLabel("Enter the units");
        c1.setBounds(50,25,150,20);
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(50, 150, 150, 20);
        tf3.setEditable(false);
        b1 = new JButton("calculate");
        b1.setBounds(50, 200, 150, 50);
        b1.addActionListener(this);
        add(tf1);
        add(tf3);
        add(b1);
        add(c1);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        int units = Integer.parseInt(s1);
        double billpay = 0;
        if (e.getSource() == b1) {
            if(units < 100){
                billpay= units*1.20;
            }
            else if(units < 300){
                billpay = 100*1.20+(units - 100)*2;
            }
            else if(units > 300){
                billpay = 100*1.20+200*2+(units-300)*3;
            }
        }
        String result = String.valueOf(billpay);
        tf3.setText(result);
    }
    public static void main(String[] args) {
        new Electric_Billing();
    }
}