interface Dialog {
    void createButton();
}

class WindowsDialog implements Dialog {

    @Override
    public void createButton()
    {

        System.out.println("Window Dialog is open");
    }
}
class WebDialog implements Dialog {

    @Override
    public void createButton()
    {

        System.out.println("Sending an e-mail notification");
    }
}

class render {
    public Dialog createDialog(String value)
    {
        switch (value) {
            case "Window":
                return new WindowsDialog();
            case "Web":
                return new WebDialog();

            default:
                throw new IllegalArgumentException("Unknown channel "+value);
        }
    }
}

public class Factory_design_pattern {
    public static void main(String[] args) {
        render r = new render();
        Dialog d = r.createDialog("Window");
        d.createButton();

    }
}
