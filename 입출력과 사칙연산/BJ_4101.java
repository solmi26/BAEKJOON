import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_4101 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String[] str = input.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            if (a == 0 && b == 0) {
                break;
            }
            if (a > b) {
                sb.append("Ye").append("\n");
            } else {
                sb.append("No").append("\n");
            }
        }
        System.out.println(sb);
    }
}