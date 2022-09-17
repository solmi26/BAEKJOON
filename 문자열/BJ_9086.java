import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(input.readLine());
        for (int i = 0; i < n; i++) {
            String str = input.readLine();
            sb.append(str.charAt(0)).append(str.charAt(str.length() - 1)).append("\n");
        }
        System.out.print(sb);
    }
}
