import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BJ_15964 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(input.readLine());

        // 30점
        int a = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());

        int result = (a + b) * (a - b);
        System.out.println(result);

        // 70점
        BigInteger a2 = new BigInteger(token.nextToken());
        BigInteger b2 = new BigInteger(token.nextToken());

        BigInteger result2 = (a2.add(b2)).multiply((a2.subtract(b2)));
        System.out.println(result2);
    }
}