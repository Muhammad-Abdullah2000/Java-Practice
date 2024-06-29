
import java.util.Scanner;
public class Example_Program {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);


    String password;
        System.out.println("Enter your password");
        password = input.nextLine();



if(password .equals ("pakistan")){

        int a;
        float b;
        String s;


       System.out.println("Enter a string");
        s = input.nextLine();
        System.out.println("Enter an integer");
        a = input.nextInt();
        System.out.println("Enter a float");
        b = input.nextFloat();

    System.out.println("You entered string "+ s);
        System.out.println("You entered integer "+a);
       System.out.println("You entered float "+b);
                 }

else{
 System.out.println("Invalid Password");
}

    }
}
