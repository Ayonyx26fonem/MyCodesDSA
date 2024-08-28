import java.util.*;

public class Matrices {
    public static boolean search(int matrix[][],int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==key) {
                    System.out.print("found at cell (" +i + "," +j +")" );
                    return true;
                }
            }
        }
        System.out.println("element not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        // output
        for (int i = 0; i < n; i++) {// can do by both matrix.length or n or matrix[0].length or j
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
        search(matrix,9);
    }
}
