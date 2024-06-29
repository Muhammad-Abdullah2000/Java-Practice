
abstract class Turningphone{
    abstract  void on();
    abstract void off();

}
//abstract class calculator{
//    abstract void sum1();
//    abstract void subtraction();
//    abstract void Multiplication();
//    abstract void Division();
//}
class Myphone extends Turningphone{
    void on(){
        System.out.println("Turning on...........");
    }
    void off(){
        System.out.println("Turning off..........");
    }
}
//class Mycalculator extends calculator{
//     @Override
//     void sum1(){
//        int a = 4;
//        int b = 5;
//        int sum = a + b;
//        System.out.println("The two values after summation " + sum);
//    }
//    @Override
//    void subtraction(){
//        int x = 4;
//        int y = 5;
//        int subtraction = x - y;
//        System.out.println("The two values after subtraction " + subtraction);
//    }
//    @Override
//    void Multiplication(){
//        int u = 4;
//        int t = 5;
//        int multiplication = u * t;
//        System.out.println("The result after Multiplication " + multiplication);
//    }
//    @Override
//    void Division(){
//        int r = 4;
//        int s = 2;
//        int division = r/s;
//        System.out.println("The after division is " + division);
//    }
//}

public class Abstarct_Class{
public static void main(String[]args){
    {
        Turningphone ph = new Myphone();
        ph.on();
        ph.off();
    }
//    {
//        calculator c = new Mycalculator();
//        c.sum1();
//        c.subtraction();
//        c.Multiplication();
//        c.Division();
//    }
        }
        }
