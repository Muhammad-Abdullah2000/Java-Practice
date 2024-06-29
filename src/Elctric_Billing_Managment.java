
import java.util.Scanner;

interface Elctric_Billing_Managment {

    public void units();
}
class result implements Elctric_Billing_Managment {
    public void units() {
        long units;
        System.out.println("Enter the units: ");
        Scanner input = new Scanner(System.in);
        units = input.nextLong();
        double billpay = 0;
        if (units < 100) {
            billpay = units * 1.20;
        } else if (units < 300) {
            billpay = 100 * 1.20 + (units - 100) * 2;
        } else if (units > 300) {
            billpay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
        }
        System.out.println("The total units are: " + billpay);
    }


    public static void main(String[] args) {
        result re = new result();
        re.units();
    }
}

