import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Gui_Program {
    public static void main(String[] args) {

        JFrame f= new JFrame("Login");
        f.setVisible(true);
        f.setSize(800,500);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
      Container c = f.getContentPane();
        c.setLayout(null);

        JLabel l = new JLabel("Enter you Username");
        l.setBounds(20,50,200,30);

        JTextField t1 = new JTextField();
        t1.setBounds(20,10,100,30);
        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(50,200,100,100);
        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(160,200,100,100);
        ButtonGroup gender= new ButtonGroup();

        JTextArea t3 = new JTextArea("I am a Peaky Blinder");
        t3.setBounds(100,200,40,100);
        t3.setLineWrap(true);

        String[] age= {"18","19","20","21","22"};
        JComboBox jb= new JComboBox(age);
        jb.setBounds(70,100,50,20);

        JCheckBox ck1 = new JCheckBox("Student");
        JCheckBox ck2 = new JCheckBox("Teacher");
        ck1.setBounds(50,300,100,50);
        ck2.setBounds(160,300,100,50);
        ButtonGroup check= new ButtonGroup();
        check.add(ck1);
        check.add(ck2);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(50,150,100,30);

        JPasswordField t2 = new JPasswordField();
        t2.setBounds(150,150,150,30);
        t2.setEchoChar('*');

        JButton btn1= new JButton("Red");
        JButton btn2= new JButton("Blue");
        JButton btn3= new JButton("Green");

        ////set lengths of button

        btn1.setBounds(320, 200,100, 20);
        btn2.setBounds(320, 250,100, 20);
        btn3.setBounds(320, 300,100, 20);


        gender.add(r1);
        gender.add(r2);
        c.add(l);
        c.add(t1);
        c.add(r1);
        c.add(r2);
        c.add(t3);
        c.add(jb);
        c.add(ck1);
        c.add(ck2);
        c.add(l2);
        c.add(t2);
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);

        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.red);

            }
        });
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.blue);

            }
        });
        btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.green);

            }
        });
    }
}
