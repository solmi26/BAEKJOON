import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BJ_1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str = input.readLine().split(" ");
        BigInteger money = new BigInteger(str[0]);
        BigInteger n = new BigInteger(str[1]);

        System.out.print(money.divide(n));
        System.out.println(money.remainder(n));
    }
}