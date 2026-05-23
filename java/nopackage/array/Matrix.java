
import java.util.Scanner;

class Matrix
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[10][10];

        System.out.print("Enter number of rows: ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int n = scanner.nextInt();

        System.out.println("Enter matrix elements:");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}