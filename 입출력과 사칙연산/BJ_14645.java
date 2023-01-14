import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_14645 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(input.readLine());
        int count = Integer.parseInt(token.nextToken());
        for (int i = 0; i < count; i++) {
            input.readLine();
        }
        System.out.println("비와이");

    }
}
