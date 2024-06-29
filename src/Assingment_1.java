
import java.util.Scanner;
public class Assingment_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int marks[] = new int[5];


        System.out.println("Enter the marks ");
        for (int i = 0; i < 5; i++) {

            marks[i] = input.nextInt();
        }


        int greater = marks[0];
        for(int p = 0; p < marks.length; p++)
        {
            if(marks[p] > greater) {

                greater = marks[p];
            }
        }
        System.out.println("greatest value " + greater );



        int lesser = marks[0];
        for(int p = 0; p < marks.length; p++)
        {
            if(marks[p] < lesser) {

                lesser = marks[p];
            }
        }
        System.out.println("least value " + lesser );




        int average;
        int total = 0;
        for (int o = 0; o < 5; o++) {
            total += marks[o];
        }

        average = total/5;
        System.out.println("Average is " + average);



        for(int i = 0; i < marks.length; i++ ) {
            System.out.println(" percentage  " + (marks[i] * 100) / 100 );
        }


    }
}



