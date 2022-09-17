import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_8545 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append(input.readLine()).reverse();
        System.out.println(sb);

    }
}