import java.util.Scanner;
public class order{

    public static void main(String[] args) {

         double TaxRate = 0.07;
         int SENTINEL = -1;

        double price;


        double totalPrice = 0.0;
//        double totalActualPrice = 0.0;
//        double totalSalesTax = 0.0;



        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price: ");
        price =  in.nextDouble();

     //   double totalPrice = 0;
//        while (price != SENTINEL) {
            double salesTax;
            double actualPrice;
            String country;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the country name");
            country = sc.nextLine();


            if (country .equals("US")){
                salesTax = TaxRate * price;
                actualPrice = price - salesTax;
               System.out.println("Actual price is $" +actualPrice);
               System.out.println("Sales Tax is: $" +salesTax);
                totalPrice = actualPrice + salesTax;
                System.out.println("Total price is: " + totalPrice);
            }
            else if(country .equals("EU")){
                salesTax = TaxRate * price;
                actualPrice = price - salesTax;
                System.out.println("Actual price is $" +actualPrice);
               System.out.println("Sales Tax is: $" +salesTax);
                totalPrice = actualPrice + salesTax;
                System.out.println("Total price is: " + totalPrice);

            }
         //  totalPrice = actualPrice + salesTax;


//            totalActualPrice = actualPrice + actualPrice;
//            totalSalesTax = salesTax + salesTax;






//            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
//            price =  in.nextDouble();

      //  }

//        System.out.println("Total price is: " + totalPrice);
//        System.out.println("Total Actual Price is: " + totalActualPrice);
//        System.out.println("Total sales tax is: " +totalSalesTax);




    }
}