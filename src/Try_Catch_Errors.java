public class Try_Catch_Errors {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        try {
            int c = a/b;
            System.out.println("The value of c is " + c);

        } catch (Exception e) {
            System.out.println("The reason for the error is: ");
            System.out.println(e);

        }
        System.out.println("End of the program");
    }

}
