
class Base1{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Base2 extends Base1 {

    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

//import java.util.Scanner;
public class Practice_Programs {
    public static void main(String[] args) {
        Base1 b = new Base1();
        b.setX(4);
        System.out.println(b.getX());
        Base2 v = new Base2();
        v.setY(5);
        System.out.println(v.getY());
//        Scanner input = new Scanner(System.in);
//        int row;
//        int space;
//        System.out.print("Enter the Number of Rows (Line): ");
//        row = input.nextInt();
//        for (int i = 0; i < row; i++) {
//            for (space = i; space < row; space++)
//                System.out.print(" ");
//            for (int j = 0; j < (i + 1); j++)
//                System.out.print("* ");
//            System.out.print("\n");
//        }
//        Scanner input1 = new Scanner(System.in);
//        int day;
//        System.out.println("Enter day: ");
//        day = input1.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

//        for(int i = 10; i > 0; i--){
//            if(i == 7){
//                continue;   //  ----> out of the loop
//            }
//            System.out.println(i);
//        }
//        int i = 0;
//        do{
//            i++;
//            if(i == 2){
//                System.out.println("Ending the Loop");
//                continue;
//
//            }
//        }while(i < 5);
//        System.out.println("Loop ends here");

//        int i = 1;
//        int factorial = 1;
//        int n = 5;
//      while(i <= n){
//          factorial *= i;
//          i++;
//
//        }
//        System.out.println(factorial);

//        int marks[] = new int[5];
//        marks[0] = 45;
//        marks[1] = 46;
//        marks[2] = 47;
//        marks[3] = 48;
//        marks[4] = 49;
//        for(int i: marks){
//            System.out.println(i);
//        }
        /// Displayong multidimensional arrys
//        int [][] flats = new int[2][3];
//        flats[0][1] = 101;
//        flats[0][1] = 102;
//        flats[0][2] = 103;
//        flats[1][0] = 111;
//        flats[1][1] = 112;
//        flats[1][2] = 113;
//        for(int i = 0; i < flats.length; i++){
//            for(int j = 0; j < flats[i].length; j++){
//                System.out.println(flats[i][j]);
//                System.out.println(" ");
//            }

     //   }
        //// Displaying the matrix addition by 2D array
//        int mat1[][] ={{0 , 1 , 2},
//                       {2, 3, 4}};
//        int mat2[][] = {{5,6,7},
//                       {2, 0, 5}};
//        int result[][] = {{0, 0, 0},
//                     {0, 0 ,0}};
//        for(int i = 0; i < mat1.length; i++){
//            for(int j = 0; j < mat1[i].length; j++){
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.println(result[i][j]);
//            }
//            System.out.println("");
//        }

//        boolean IsSorted = true;
//        int arr[] = {0 , 2, 3,4, 5};
//        for(int i = 0 ; i < arr.length-1; i++){
//            if(IsSorted){
//                System.out.println("Is sorted");
//                break;
//            }
//            else{
//                System.out.println("It is not sorted");
//            }
//        }
        //// Inheritence programm


    }
}