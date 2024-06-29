import javax.swing.*;

public class Login_Joption {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton b = new JButton("log in");
        JTextField f = new JTextField();
        JTextField t = new JTextField();
        JTextField t1 = new JTextField();
        JLabel label = new JLabel("Name");
        JLabel label1 = new JLabel("password");
        label.setBounds(30,200,90,90);
        frame.setSize(500,500);
        frame.add(label);
        t.setBounds(100,230,90,30);
        frame.setSize(500,500);
        frame.add(t);
        label1.setBounds(30,300,90,90);
        frame.setSize(500,500);
        frame.add(label1);
        t1.setBounds(100,330,90,30);
        frame.setSize(500,500);
        frame.add(t1);
        b.setBounds(200,400,90,20);
        frame.setSize(500,500);
        frame.add(b);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setLayout(null);
        frame.setVisible(true);



    }
}
