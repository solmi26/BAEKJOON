import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_5522 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result += Integer.parseInt(input.readLine());
        }
        System.out.println(result);
    }
}
