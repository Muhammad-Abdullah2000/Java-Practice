import java.util.Scanner;



public class Simple_Try_Catch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int marks[] = new int[3];
        marks[0] = 3;
        marks[1] = 52;
        marks[2] = 6;

        int index;
        System.out.println("Enter the index number from 0 to 2: ");
        index = input.nextInt();
        /// System.out.println("The values you choose are: " + marks[index]);


        int number;
        System.out.println("Enter the number you want to divide: ");
        number = input.nextInt();
        System.out.println("Number you entered for division is: " + number);

     ///   try {
            //     System.out.println("The result is: " + marks[index]/number);
            //   }catch (ArrayIndexOutOfBoundsException a){
            //       System.out.println("The error is");
            //        System.out.println(a);
            //   }catch(ArithmeticException b){
            //       System.out.println("The error is: ");
            //     System.out.println(b);
            //     }


            //    int a;
            //  a = input.nextInt();
            //  int b;
            //  b = input.nextInt();


            /// try{
            //    int c = a/b;
            //      System.out.println("The result after the division is: " + c);

            ///  catch(ArithmeticException e){
            //    System.out.println("There is a aritmemetic exception");
            //   System.out.println(e);

            ///  }
            /// catch(Exception b){
            ///  System.out.println("Some other error: " + b);
            ///    System.out.println(b);
            ///    }
            ////    System.out.println("End of the program");



    }
}
