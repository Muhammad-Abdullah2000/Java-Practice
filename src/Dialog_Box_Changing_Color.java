import javax.swing.*;
import java.awt.*;
interface MessageDialog{
    void messageDialog();
}
class MyMessageDialog implements MessageDialog{
    @Override
    public void messageDialog(){
        UIManager uiManager = new UIManager();
        uiManager.put("OptionPane.messageForeground", Color.white);
        uiManager.put("OptionPane.background", Color.blue);
        uiManager.put("Panel.background", Color.black);


        //// Information Message dialog box:
        JOptionPane.showMessageDialog(null,"This is message Dialog box",
                "Set Color", JOptionPane.INFORMATION_MESSAGE);

    }
}
interface ConfirmationDialog{
    void confirmationDialog();
}
class MyConfirmationDialog implements ConfirmationDialog{
    @Override
    public void confirmationDialog() {

        UIManager uiManager1 = new UIManager();
        uiManager1.put("OptionPane.messageForeground", Color.red);
        uiManager1.put("OptionPane.background", Color.pink);
        uiManager1.put("Panel.background", Color.yellow);

        ///// Confirmation Dialog box:
        int choice = JOptionPane.showConfirmDialog(null, "are you sure?");
        if(choice == 0){
            JOptionPane.showMessageDialog(null,"You selected yes!");
        }
        else if(choice == 1){
            JOptionPane.showMessageDialog(null,"You selected NO!");
        }
        else if(choice == 2){
            JOptionPane.showMessageDialog(null,"You seleted cancel!");
        }
    }
}
interface InputDialog{
    void inputDialog();
}
class MyInputDialog implements InputDialog{
    @Override
    public void inputDialog() {
        UIManager uiManager2 = new UIManager();
        uiManager2.put("OptionPane.messageForeground", Color.BLUE);
        uiManager2.put("OptionPane.background", Color.yellow);
        uiManager2.put("Panel.background", Color.GREEN);

        /// Input dialog box:
        String name = JOptionPane.showInputDialog(null,"What's your name?");
        JOptionPane.showMessageDialog(null,"Your name is: " + name);
        String regNumber = JOptionPane.showInputDialog(null,"What's your Registration number?");
        int Reg = Integer.parseInt(regNumber);
        JOptionPane.showMessageDialog(null,"Your registration number is: " + Reg);
        System.out.println("The name is: " + name);
        System.out.println("The Registration is: " + regNumber);
    }
}

public class Dialog_Box_Changing_Color {
    public static void main(String[] args) {
        MyMessageDialog m1 = new MyMessageDialog();
        m1.messageDialog();
        MyConfirmationDialog c1 = new MyConfirmationDialog();
        c1.confirmationDialog();
        MyInputDialog i1 = new MyInputDialog();
        i1.inputDialog();
    }
}
