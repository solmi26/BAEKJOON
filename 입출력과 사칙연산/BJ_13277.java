import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BJ_13277 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] line = input.readLine().split(" ");

        BigInteger a = new BigInteger(line[0]);
        BigInteger b = new BigInteger(line[1]);
        System.out.println(a.multiply(b));
    }
}