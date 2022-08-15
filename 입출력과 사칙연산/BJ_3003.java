import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        StringTokenizer token = new StringTokenizer(str, " ");

        int[] piece = { 1, 1, 2, 2, 2, 8 };
        int i = 0;

        while (token.hasMoreTokens()) {
            System.out.print(piece[i] - Integer.parseInt(token.nextToken()) + " ");
            i++;

        }

    }

}
