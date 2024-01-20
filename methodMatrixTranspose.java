import java.util.Scanner;
public class methodMatrixTranspose {
    static void TransposeMatrix(int array[][], int cols, int rows){
        int transpose[][] = new int [cols][rows];
        for(int i = 0; i<cols;i++){
            for(int j = 0; j<rows; j++){
                System.out.print("Transpose Matrix[" + i + "][" + j + "]");
                transpose[i][j] = array[j][i] ;
                System.out.println(transpose[i][j]);
            }
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rows, cols;
        System.out.print("Enter the dimension of the matrix(rows, columns): ");
        rows = input.nextInt();
        cols = input.nextInt();
        int matrix[][] = new int [rows][cols];
        for(int i = 0; i<rows;i++){
            for(int j = 0; j<cols; j++){
                System.out.print("Matrix[" + i + "][" + j + "]");
                matrix[i][j] = input.nextInt();
                System.out.println();
            }
        }
        TransposeMatrix(matrix, cols, rows);
    }
}
