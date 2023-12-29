import java.util.Scanner;
public class matrixmultiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rows1, cols1;
        System.out.print("Enter the number of rows in the first matrix: ");
        rows1 = input.nextInt();
        System.out.print("Enter the number of columns in the first matrix: ");
        cols1 = input.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter the number of rows in the second matrix: ");
        int rows2 = input.nextInt();
        System.out.print("Enter the number of columns in the second matrix: ");
        int cols2 = input.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        int[][] productMatrix = new int[rows1][cols2]; 
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Product Matrix: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(productMatrix[i][j] + " ");
            }
        }
    }
}
