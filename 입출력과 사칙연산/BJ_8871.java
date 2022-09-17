import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_8871 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int round = Integer.parseInt(input.readLine()) + 1;
        sb.append(round * 2).append(" ").append(round * 3);
        System.out.println(sb);
    }
}
