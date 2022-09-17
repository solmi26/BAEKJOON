import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BJ_8437 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BigInteger total = new BigInteger(input.readLine());
        BigInteger lot = new BigInteger(input.readLine());
        BigInteger half = new BigInteger("2");
        System.out.println(total.subtract(lot).divide(half).add(lot));
        System.out.println(total.subtract(lot).divide(half));

    }
}
