interface University{
    void Department();
}
class computerScience implements University{
    public void Department(){
        System.out.println("Welcome to ComputerScience Department");
    }
}
class Mathematics implements University{
    public void Department(){
        System.out.println("Welcome to Mathematics Department");
    }
}
class Biology implements University{
    public void Department(){
        System.out.println("Welcome to Biology Department");
    }
}
public class Interface_Catch_Error {
    public static void main(String[] args) {

//        try{
//            interface i = new interface();
//            i.Department();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        Mathematics m = new Mathematics();
        computerScience c = new computerScience();
        Biology b = new Biology();

        m.Department();
        c.Department();
        b.Department();
    }
}
