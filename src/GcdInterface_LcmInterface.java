interface GcdInterface{
    void commonnumber();                                                 //    NAME:     M.Abdullah
}                                                                        //    Reg#     FA20-BSE-052
interface LcmInterface{                                                 //  Subject:   Object Oriented Programmming
    void Commonnumber();                                            //  Assingmnet#          3
}                                                                   //  Submitted to:     Sir Nasir Mehdi
class Gcdlcm implements GcdInterface, LcmInterface{               //    Question#             3
    public void commonnumber(){
        int x = 45;
        int y = 78;
        int gcd = 1;

        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0)
                gcd = i;
        }
        System.out.println("GCD of " + x +" and " + y + " is " + gcd);
    }
    public void Commonnumber(){
        int x1 = 34;
        int y1 = 56;
        int lcm;
        lcm = (x1 > y1) ? x1 : y1;
        while(true) {
            if( lcm % x1 == 0 && lcm % y1 == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", x1, y1, lcm);
                break;
            }
            ++lcm;
        }
    }
}
public class GcdInterface_LcmInterface {
    public static void main(String[] args) {
        Gcdlcm cm = new Gcdlcm();
               cm.commonnumber();
               cm.Commonnumber();
    }
}
