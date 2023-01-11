import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(input.readLine());
        int stick = 64;
        int count = 0;
        while (x != 0) {
            if (stick <= x) {
                x -= stick;
                count++;
            }
            stick = stick / 2;
        }
        System.out.println(count);
    }
}