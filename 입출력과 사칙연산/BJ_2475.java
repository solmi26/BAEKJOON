import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str = input.readLine().split(" ");
        int result = 0;
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(str[i]);
            result += n * n;
        }
        System.out.println(result % 10);
    }
}
