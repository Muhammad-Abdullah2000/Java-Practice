import java.awt.*;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class Doremon extends Canvas{
    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,50));
        setForeground(Color.green);
        g.drawString("Doremon",40,40);
        g.fillOval(110,80,50,50);
        g.fillOval(180,80,50,50);
        g.drawOval(50,50,250,250);
        g.drawLine(120, 200, 200, 200);
        g.drawRect(120,300,100,20);
        g.fillRect(50, 320, 250, 250);
        g.drawOval(80,570,100,20);
        g.drawOval(180,570,100,20);
    }
    public static void main(String[] args) {
        Doremon m=new Doremon();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(800,800);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}