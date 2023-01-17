import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BJ_15740 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(input.readLine());

        BigInteger a = new BigInteger(token.nextToken());
        BigInteger b = new BigInteger(token.nextToken());

        System.out.println(a.add(b));
    }
}