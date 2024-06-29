
interface button{
    void render();
    void onClick();
}
class windowsButton implements button{
    public void render()
    {
        System.out.println("Render Windows Style");
    }
    public void onClick()
    {
        System.out.println("onClick Windows dialog open");
    }
}
class HTMLButton implements button{
    public void render()
    {
        System.out.println("Html button render");
    }
    public void onClick()
    {
        System.out.println("onClick HTML button");
    }
}
class diaplay {
    public button createButton(String value)
    {
        switch (value) {
            case "Window":
                return new windowsButton();
            case "html":
                return new HTMLButton();

            default:
                throw new IllegalArgumentException("Unknown value " + value);
        }
    }
}

    public class factory_design_pattern_2 {
        public static void main(String[] args) {
            diaplay d= new diaplay();
            button b = d.createButton("html");
            b.render();
            b.onClick();
        }
    }

