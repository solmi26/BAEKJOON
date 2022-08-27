import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1152 {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        StringTokenizer token = new StringTokenizer(str, " ");
        int count = token.countTokens();
        System.out.println(count);
    }
}
