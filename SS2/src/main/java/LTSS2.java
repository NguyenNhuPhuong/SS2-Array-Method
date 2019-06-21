
import java.util.Scanner;

public class LTSS2 {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);

        int matrix[][] = new int[5][2];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = input.nextInt();
//            }
//        }
        // random cac phan tu trong mang
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        // tinh tong gia tri cac phan tu trong mang
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }
        System.out.println(total);


        // tinh tong cac cot trong mang
        for (int column = 0; column < matrix[0].length; column++) {
            int total1 = 0;
            for (int row = 0; row < matrix.length; row++)
                total1 += matrix[row][column];
            System.out.println("Sum for column " + column + " is "
                    + total1);
        }

        //tinh tong cac hang trong mang
        for (int row = 0; row < matrix.length; row++) {
            int total2 = 0;
            for (int column = 0; column < matrix[0].length; column++) {
                total2 += matrix[row][column];
            }
            System.out.println("Sum for row " + row + " is " + total2);

        }

        //tìm hang lon nhat trong mang
        int maxRow = 0;
        int indexOfMaxRow = 0;
        // Get sum of the first row in maxRow
        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        }
        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++)
                totalOfThisRow += matrix[row][column];
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);


        //xao tron mang
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                int i1 = (int) (Math.random() * matrix.length);
//                int j1 = (int) (Math.random() * matrix[i].length);
//
//                // Swap matrix[i][j] with matrix[i1][j1]
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[i1][j1];
//                matrix[i1][j1] = temp;
//            }
//        }
    }
}
