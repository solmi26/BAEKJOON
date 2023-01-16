import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String num = input.readLine();

        Long remainder = 0l;
        for (int i = 0; i < num.length(); i++) {
            remainder = (remainder * 10 + (num.charAt(i) - '0')) % 20000303;
        }
        System.out.println(remainder);
    }
}