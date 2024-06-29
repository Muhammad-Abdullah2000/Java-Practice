interface InputStreamInterface{                                   //          NAME:     M.Abdullah
    void convert(int a);                                          //          Reg#      FA20-BSE-052
}                                                                ///        Subject:    Object Oriented Programming
interface OutputStreamInterface{                                 //      Assingment#         3
    void convert1(int b);                                        //    Submitted to:     Sir Nasir Mehdi
}                                                                //    Question#               1
class InputStream{
    public void convert(int a){
        System.out.println(a);
    }
}
class OutputStream{
    public void convert1(int b){
        System.out.println(b);
    }
}
class IntoStringouttoString extends InputStream implements InputStreamInterface{
    public void convert(int a){
        System.out.println("The InputInterface is: " + a);
    }
        }
class IntoStringouttoString1 extends OutputStream implements OutputStreamInterface{
    public void convert1(int b){
        System.out.println("The OutputInterface is: " + b);
    }
}
public class InputStream_OutputStream {
    public static void main(String[] args) {
        IntoStringouttoString I = new IntoStringouttoString();
        IntoStringouttoString1 I1 = new IntoStringouttoString1();
        I.convert(34);
        I1.convert1(70);
    }
}
