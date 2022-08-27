import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2675 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int count_1 = Integer.parseInt(input.readLine());
        for (int i = 0; i < count_1; i++) {
            StringTokenizer token = new StringTokenizer(input.readLine(), " ");
            int count_2 = Integer.parseInt(token.nextToken());
            String str = token.nextToken();
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < count_2; k++) {
                    sb.append(str.charAt(j));
                }
            }
            sb.append("\n");

        }
        System.out.println(sb);
    }
}