import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Terminal {
    public static void main(String[] args) {
        {

            JFrame f = new JFrame("OOSE Lab Terminal");
            f.setVisible(true);
            f.setSize(800, 700);
            f.setDefaultCloseOperation(EXIT_ON_CLOSE);
            Container c = f.getContentPane();
            c.setLayout(null);

            JLabel l = new JLabel("Customer Name");
            l.setBounds(20, 10, 200, 30);

            JTextField t1 = new JTextField();
            t1.setBounds(200,15,200,25);

            JLabel l2 = new JLabel("Pizza Size");
            l2.setBounds(100, 60, 200, 30);



            JRadioButton r1 = new JRadioButton("small");
            r1.setBounds(300,60,100,30);

            JRadioButton r2 = new JRadioButton("medium");
            r2.setBounds(400,60,100,30);

            JRadioButton r3 = new JRadioButton("Large");
            r3.setBounds(500,60,100,30);


            JLabel l3 = new JLabel("Crust Type");
            l3.setBounds(200, 120, 200, 30);

            String[] CType= {"Thin","sfrgssg","kjkdfie","effjh","edkjf"};
            JComboBox jb= new JComboBox(CType);
            jb.setBounds(300,126,80,20);

            JLabel l4 = new JLabel("Toppings");
            l4.setBounds(100, 200, 200, 30);

            String[] Type= {"Pepperoal","Suasage","Green pepper","Onions","Tomatoes","Anchovies"};
           JTextField t2 = new JTextField(Arrays.toString(Type));
            t2.setBounds(200,200,200,100);

            JLabel l5 = new JLabel("Extras");
            l5.setBounds(100, 330, 200, 30);

            JCheckBox ck1 = new JCheckBox("BreadSticks");
            ck1.setBounds(200,324,100,50);

            JCheckBox ck2 = new JCheckBox("Salad");
            ck2.setBounds(300,324,100,50);

            JCheckBox ck3 = new JCheckBox("Soda");
            ck3.setBounds(400,324,100,50);

            JLabel l6 = new JLabel("Other Comments");
            l6.setBounds(100, 450, 200, 30);

            JTextField t3 = new JTextField();
            t3.setBounds(220,450,200,100);

            JButton btn1= new JButton("Place Order");
            btn1.setBounds(200, 600,120, 20);

            JButton btn2= new JButton("Rest Values");
            btn2.setBounds(400, 600,120, 20);

            btn1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,"Your Order is submitted");

                }
            });




            c.add(l);
            c.add(t1);
            c.add(l3);
            c.add(l2);
            c.add(r1);
            c.add(r2);
            c.add(r3);
            c.add(jb);
            c.add(l4);
           c.add(t2);
           c.add(l5);
           c.add(ck1);
            c.add(ck2);
            c.add(ck3);
            c.add(l6);
            c.add(t3);
            c.add(btn1);
            c.add(btn2);

        }
    }
}
