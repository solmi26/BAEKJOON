import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(input.readLine());
        int n = 0;
        for (int i = 1; i <= count; i++) {
            if (i >= 100) {
                int a = i % 10;
                int b = (i / 10) % 10;
                int c = i / 100;
                if (a - b == b - c) {
                    n++;
                }
            } else {
                n++;
            }

        }
        System.out.println(n);
    }
}