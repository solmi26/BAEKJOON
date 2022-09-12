import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str = input.readLine().split(" ");
        int row = Integer.parseInt(str[0]);// 3
        int col = Integer.parseInt(str[1]);// 3
        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        for (int i = 0; i < a.length; i++) {
            String[] line = input.readLine().split(" ");
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = Integer.parseInt(line[j]);
            }
        }
        for (int i = 0; i < b.length; i++) {
            String[] line = input.readLine().split(" ");
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = Integer.parseInt(line[j]);
            }
        }

        for (int k = 0; k < row; k++) {
            for (int l = 0; l < col; l++) {
                System.out.print(a[k][l] + b[k][l] + " ");
            }
            System.out.println();

        }

    }
}
