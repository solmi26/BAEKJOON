import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_14652 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(input.readLine());
        int r = Integer.parseInt(token.nextToken());
        int c = Integer.parseInt(token.nextToken());
        int index = Integer.parseInt(token.nextToken());
        int mySeat = 0;

        // int[][] seat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mySeat == index) {
                    System.out.println(i + " " + j);
                    return;
                }
                mySeat++;
            }
        }

    }
}
