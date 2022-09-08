import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BJ_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str = input.readLine().split(" ");
        BigInteger a = new BigInteger(str[0]);
        BigInteger b = new BigInteger(str[1]);

        System.out.println(a.add(b));
    }
}
