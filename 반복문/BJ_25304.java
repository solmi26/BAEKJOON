import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_25304 {
    public static void main(String[] args) throws IOException {
        String result = "No";
        int sum = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(reader.readLine());
        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer token = new StringTokenizer(reader.readLine(), " ");
            int product = Integer.parseInt(token.nextToken());
            int price = Integer.parseInt(token.nextToken());
            sum += (product * price);
        }
        if (total == sum) {
            result = "Yes";
        }
        System.out.println(result);
    }
}