
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";
        while ((str = input.readLine()) != null) {
            sb.append(str).append("\n");
        }

        System.out.println(sb);

    }
}
