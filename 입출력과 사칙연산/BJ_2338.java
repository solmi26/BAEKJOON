import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BJ_2338 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(input.readLine());
        BigInteger b = new BigInteger(input.readLine());

        StringBuilder sb = new StringBuilder();

        sb.append(a.add(b)).append("\n").append(a.subtract(b)).append("\n").append(a.multiply(b));
        System.out.print(sb);
    }
}
