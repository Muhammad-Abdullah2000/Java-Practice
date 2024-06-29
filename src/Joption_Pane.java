import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Joption_Pane extends JFrame implements ActionListener{
    JTextField input_1, input_2, output;
    JButton button;
    Joption_Pane() {
        input_1= new JTextField();
        input_1.setBounds(50, 50, 150, 20);
        input_2 = new JTextField();
        input_2.setBounds(50, 100, 150, 20);
        output = new JTextField();
        output.setBounds(50, 150, 150, 20);
        output.setEditable(false);
        button = new JButton("show");
        button.setBounds(100, 200, 100, 50);

        button.addActionListener(this);
  //      add(input_1);
        add(input_2);
        add(output);
        add(button);
//        add(b2);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
   //     String s1 = input_1.getText();
        String s2 = input_2.getText();
    //    int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == button) {
         //   c = a;
            c = b;

        }
       String result = String.valueOf(c);
        output.setText(result);
    }
    public static void main(String[] args) {
        new Joption_Pane();
    }
}