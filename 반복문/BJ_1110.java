import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int x;
        int a = 0;
        int b = 0;
        int count = 0;
        x = Integer.parseInt(input.readLine());
        int temp = x;
        do {

            a = x / 10;
            b = x % 10;
            x = (b * 10) + (a + b) % 10;
            count++;

        } while (x != temp);
        System.out.println(count);

    }
}
