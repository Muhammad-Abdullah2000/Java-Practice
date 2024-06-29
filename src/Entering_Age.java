
import java.util.Scanner;

public class Entering_Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password;
        System.out.println("Enter your password");
        password = input.nextLine();
        if (password .equals("pakistan")) {
            int age;
            System.out.println("Enter your age");
            age = input.nextInt();
            System.out.println("You Entered your " + age + " age");

        }
        else{
            System.out.println("Invalid Password");
        }
    }
}
