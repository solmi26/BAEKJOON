import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10952 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int sum = 0;
            String line = input.readLine();
            StringTokenizer token = new StringTokenizer(line, " ");
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            if (a == 0 && b == 0) {
                break;
            }
            sum = a + b;
            sb.append(sum).append("\n");

        }
        System.out.println(sb);
    }
}
