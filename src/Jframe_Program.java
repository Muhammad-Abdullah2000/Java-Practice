import javax.swing.*;
import java.awt.*;

public class Jframe_Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton b = new JButton("Click ME");
        JButton b1 = new JButton("Click ME");
   JButton b2 = new JButton("Click ME");
       JButton b3 = new JButton("Click ME");
       JButton b4 = new JButton("Click ME");
       JButton b5 = new JButton("Click ME");
        b.setBounds(30,90,90,90);
        frame.add(b);
        JFrame frame1 = new JFrame();
        frame1.setSize(500,500);
        b1.setBounds(30,200,90,90);
        frame.add(b1);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame frame2 = new JFrame();
        frame2.setSize(500,500);
        b2.setBounds(30,400,90,90);
        frame.add(b2);

        JFrame frame3 = new JFrame();
        frame3.setSize(500,500);
        b3.setBounds(300,200,90,90);
        frame.add(b3);

        JFrame frame4 = new JFrame();
        frame4.setSize(500,500);
        b4.setBounds(300,80,90,90);
        frame.add(b4);

        JFrame frame5 = new JFrame();
        frame5.setSize(500,500);
        b5.setBounds(300,400,90,90);
        frame.add(b5);


    }
}
