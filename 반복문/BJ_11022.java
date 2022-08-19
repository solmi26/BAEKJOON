import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder br = new StringBuilder();
        int count = Integer.parseInt(input.readLine());
        for (int i = 1; i <= count; i++) {
            String str = input.readLine();
            br.append("Case #").append(i).append(": ").append(str.charAt(0)).append(" + ").append(str.charAt(2))
                    .append(" = ").append(str.charAt(0) - '0' + str.charAt(2) - '0').append("\n");
        }
        System.out.println(br);
    }
}
