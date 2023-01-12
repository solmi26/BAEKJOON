import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_6840 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine());
        int b = Integer.parseInt(input.readLine());
        int c = Integer.parseInt(input.readLine());

        int mid = a;
        if ((a < b && b < c && a < c) || (c < b && b < a && c < a)) {
            mid = b;
        } else if ((a > c && c > b && a > c) || (b > a && a < c && b > c)) {
            mid = c;
        }

        System.out.println(mid);
    }
}