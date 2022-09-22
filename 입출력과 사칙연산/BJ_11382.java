import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str = input.readLine().split(" ");
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            sum += Integer.parseInt(str[i]);
        }
        System.out.println(sum);
    }

}
