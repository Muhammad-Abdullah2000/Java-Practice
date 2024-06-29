public class MultiDimensional_Array {
    public static void main(String[] args) {

        int[][] matrix = new int[2][3];  //  By Declaration and memory allocation method
        matrix[0][0] = 101;
        matrix[0][1] = 102;
        matrix[0][2] = 103;
        matrix[1][0] = 201;
        matrix[1][1] = 202;
        matrix[1][2] = 203;

        System.out.println("Printing a matrix using for loop");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
