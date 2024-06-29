interface Bicycle{
    int a = 45;
    void applyBrake();
    void speedUp();
}
interface HornBicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle, HornBicycle{

    public void applyBrake(){
        System.out.println("Applying Brake");
    }
    public void speedUp(){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornK3g(){
        System.out.println("pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("po po po po");
    }
}
public class Interfaces {
    public static void main(String[] args) {
      AvonCycle cycleHarry = new AvonCycle();
       cycleHarry.applyBrake();
        // You can create properties in Interfaces
   //     System.out.println(cycleHarry.a);
     //   System.out.println(cycleHarry.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        //System.out.println(cycleHarry.a);

        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();

    }
}
