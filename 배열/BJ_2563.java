import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2563 {
    public static void main(String[] args) throws IOException {
        int[][] paper = new int[100][100];
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int b_count = Integer.parseInt(input.readLine());
        for (int i = 0; i < b_count; i++) {
            String[] line = input.readLine().split(" ");
            int w = Integer.parseInt(line[0]);
            int c = Integer.parseInt(line[1]);

            for (int j = w; j < w + 10; j++) {
                for (int k = c; k < c + 10; k++) {
                    paper[j][k] = 1;
                }
            }
        }
        int count = 0;
        for (int j = 0; j < paper.length; j++) {
            for (int k = 0; k < paper[j].length; k++) {
                if (paper[j][k] == 1) {
                    count += 1;
                }
            }
        }

        System.out.println(count);

    }
}