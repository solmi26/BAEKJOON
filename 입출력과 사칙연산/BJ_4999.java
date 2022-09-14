import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str1 = input.readLine();
        String str2 = input.readLine();
        if (str1.length() >= str2.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
