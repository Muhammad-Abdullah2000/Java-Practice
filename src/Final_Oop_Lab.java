import java.awt.*;
import javax.swing.*;
public class Final_Oop_Lab {
    Final_Oop_Lab(){

        JLabel label = new JLabel("OOp Lab");
        label.setBounds(30,0,90,9);
        JLabel label_1 = new JLabel("Start Application");
        label_1.setBounds(30,30,10,30);
        JLabel label_2 = new JLabel("credits");
        label_2.setBounds(5,125,50,30);

//
        JPanel panel_1=new JPanel();
        panel_1.setBounds(5,50,400,60);
        panel_1.setBackground(Color.gray);
//
        JPanel panel_2= new JPanel();
        panel_2.setBounds(5,150,800,400);
        panel_2.setBackground(Color.gray);

//        JPanel panel_3= new JPanel();
//        panel_3.setBounds(0,10,500,400);
//        panel_3.setBackground(Color.blue);


        JPanel panel=new JPanel();
        panel.setBounds(5,5,400,30);
        panel.setBackground(Color.gray);

        JFrame frame= new JFrame("Panel Example");
        frame.add(panel);
        frame.add(panel_1);
        frame.add(panel_2);
//        frame.add(panel_3);

        frame.add(label_2);
        frame.setSize(800,600);
        frame.setLayout(null);
        frame.setVisible(true);
        panel.add(label);
        panel_1.add(label_1);
  //      panel_2.add(panel_3);





    }
    public static void main(String args[])
    {
        new Final_Oop_Lab();
    }
}