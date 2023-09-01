//7.TraceTranspose
import java.util.Scanner;

class TraceTranspose {
    public static void main(String[] args) {

        int[][] matrix;
        int[][] transpose;
        int sum = 0, r, c;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number of Rows : ");
        r = in.nextInt();

        System.out.print("nter the Number of Columns : ");
        c = in.nextInt();

        if (r != c) {
            System.out.println("Only square matrix allowed.");
        } else {
            matrix = new int[r][c];
            transpose = new int[c][r];

            System.out.print("Enter the Elements of Matrix : ");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = in.nextInt();
                }
            }

            System.out.println("\nGiven Matrix");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print("\n");
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    transpose[j][i] = matrix[i][j];
                    if (i == j) {
                        sum = sum + (matrix[i][j]);
                    }
                }
            }
            System.out.println("\nThe Trace of the Given Matrix is = " + sum);
            System.out.println("\nTranspose Matrix");
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < r; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
    }
}
/*Enter the Number of Rows : 3
nter the Number of Columns : 3
Enter the Elements of Matrix : 1 2 3 4 5 6 7 8 9

Given Matrix
1 2 3
4 5 6
7 8 9

The Trace of the Given Matrix is = 15

Transpose Matrix
1 4 7
2 5 8
3 6 9
*/
