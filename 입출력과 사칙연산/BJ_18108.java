import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        System.out.println(Integer.parseInt(str) - 543);
    }
}
