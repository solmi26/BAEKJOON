import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[][] array = new int[2][9];
        int max = 0;
        int max_w = 0;
        int max_c = 0;

        for (int i = 0; i < array.length; i++) {
            String str = input.readLine();
            String number[] = str.split(" ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.parseInt(number[j]);
                // System.out.print(array[i][j]);
                if (max <= array[i][j]) {
                    max = array[i][j];
                    max_w = i + 1;
                    max_c = j + 1;
                }

            }
            // System.out.println();
        }

        System.out.println(max);
        System.out.println(max_w + " " + max_c);

    }
}
