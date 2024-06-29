interface PrimeInterface{
  void primeNumbers(int a);                                           //     NAME:              M.Abdullah
}                                                                     //     Reg#               FA20-BSE-052
interface Armstronginterface{                                       ///   Subject:        Object Oriented Programming
    void ArmStrongNumbers(int b);                                  //  Assingment#                 3
}                                                                 //  Submitted to:          Sir Nasir Mehdi
 class checkNumbers implements PrimeInterface{                     //  Question#                   2
     @Override
     public void primeNumbers(int a) {
         boolean b = false;
         for (int i = 1; i <= a / 2; ++i){
             if (a % i == 0){
                 b = true;
                 break;
             }
         }
         if (!b) {
             System.out.println(a + " is a prime number.");
         }
         else {
             System.out.println(a + " Is not a prime number");
         }
     }
 }
 class checkNumbers1 implements Armstronginterface{
    public void ArmStrongNumbers(int b){
        int originalNumber;
        int remainder;
        int result = 0;
        originalNumber = b;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == b)
            System.out.println("It is a ArmStrongNumber: " +b);
        else
            System.out.println("It is not a ArmStrongNumber" +b);
    }
 }
    public class PrineInterface_ArmStrongInterface {
        public static void main(String[] args) {
            checkNumbers c = new checkNumbers();
            checkNumbers1 c1 = new checkNumbers1();
            c.primeNumbers(1);
            c1.ArmStrongNumbers(0);

        }
    }


