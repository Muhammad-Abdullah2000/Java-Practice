import java.util.Scanner;
public class Assingment_2_Second_Diagram {
    public static void main(String[] args) {                                         ///     NAME:               M.ABDULLAH
        System.out.println("Type IllegalStateException: ");                        //       Reg#                FA20-BSE-052
        String a;                                                                ////     Subject:        Object Orianted Programming
        Scanner input = new Scanner(System.in);                                    //      Assingmnet#              2
        a = input.nextLine();                                                    //        Submitted to:       Sir Nasir Mehdi
        if (a .equals("IllegalStateException")) {
            try {
                throw new IllegalStateException("IllegalStateException Occured");
            } catch (IllegalStateException i) {
               i.printStackTrace();

            }
            System.out.println("Type IllegalArgumentException: ");
            String b;
            Scanner input1 = new Scanner(System.in);
            b = input1.nextLine();
            if (b .equals("IllegalArgumentException")) {
                try {
                    throw new IllegalArgumentException("IllegalArgumentException Occured");
                } catch (IllegalArgumentException I) {
                    I.printStackTrace();
                }
                try {
                    throw new NumberFormatException("NumberFormatException Occured");
                } catch (NumberFormatException n) {
                    n.printStackTrace();
                }
                System.out.println("Type NullPointerException: ");
                String c;
                Scanner input2 = new Scanner(System.in);
                c = input2.nextLine();
                if (c .equals("NullPointerException")) {
                    try {
                        throw new NullPointerException("NullPointerException Occured");
                    } catch (NullPointerException l) {
                        l.printStackTrace();
                    }
                    System.out.println("Type IndexOutOfException");
                    String d;
                    Scanner input3 = new Scanner(System.in);
                    d = input3.nextLine();
                    if (d .equals("IndexOutOfException")) {
                        try {
                            throw new IndexOutOfBoundsException("IndexOutOfBoundException Occured");
                        } catch (IndexOutOfBoundsException k) {
                            k.printStackTrace();
                        }
                        try {
                            throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundException Occured");
                        } catch (ArrayIndexOutOfBoundsException j) {
                            j.printStackTrace();
                        }
                    }

                }

            }
        }
    }
}