import java.util.Scanner;
public class Khizar_Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] marks = new int[5];
        int max, min, total = 0, average, percentage;
        System.out.println("Enter Marks of Students");

        for (int i = 0; i <5; i++) {
            marks[i] = input.nextInt();
        }

        System.out.println("Marks of Students are the following:");
        for (int j = 0; j < 5; j++) {
            System.out.println( marks[j] + " out of 100");
        }

        max = marks[0];
        for (int k = 0; k < 5; k++) {
            if (marks[k]> max)
            {
                max = marks[k];
            }
        }

        min = marks[0];
        for (int l = 0; l < 5; l++) {
            if (marks[l]< min)
            {
                min = marks[l];
            }
        }

        for (int m = 0; m < 5; m++) {
            total += marks[m];
        }

        average = total/5;

        System.out.println("Maximum Marks " + max);
        System.out.println("Minimum Marks " + min);
        System.out.println("Average Marks " + average);

        System.out.println("Percentage of Students are the following: ");
        for (int n = 0; n < 5; n++) {

            System.out.println(((marks[n] *100)/100) +" %");
        }

    }
}


