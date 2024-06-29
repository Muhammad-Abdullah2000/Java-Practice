
import java.util.Scanner;
public class Handling_Specific_Exception {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int marks[] = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        int index;

        System.out.println("Enter Index number from 0 to 2: ");
        index = input.nextInt();
        System.out.println("The value of Index you entered: " + marks[index]);

        int number;
        System.out.println("Enter the number you want divide the index: ");
        number = input.nextInt();
        System.out.println("The number you entered for division: " + number);


        try{
            System.out.println("The index user entered is: " + marks[index]);
            System.out.println("The result after the division occured is: " + marks[index]/number);
        }catch (ArithmeticException a){
            System.out.println("Arithemetic exception occured!");
            System.out.println(a);
        }catch (IndexOutOfBoundsException b){
            System.out.println("Index Exception occured!");
            System.out.println(b);
        }catch (Exception c){
            System.out.println("Some other Exception occred!");
            System.out.println(c);
        }

        System.out.println("End of the Program");

    }
}
