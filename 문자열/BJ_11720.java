import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(input.readLine());
        int sum = 0;
        String line = input.readLine();
        for (int i = 0; i < count; i++) {
            sum += line.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}
