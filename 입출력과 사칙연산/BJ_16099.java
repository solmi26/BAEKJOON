import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BJ_16099 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(input.readLine());
        for (int i = 0; i < count; i++) {
            StringTokenizer token = new StringTokenizer(input.readLine());
            BigInteger t1 = new BigInteger(token.nextToken());
            BigInteger t2 = new BigInteger(token.nextToken());
            BigInteger e1 = new BigInteger(token.nextToken());
            BigInteger e2 = new BigInteger(token.nextToken());
            BigInteger telecom = t1.multiply(t2);
            BigInteger eurecom = e1.multiply(e2);
            String result = "";
            if (telecom.equals(eurecom)) {
                result = "Tie";
            } else if (telecom.max(eurecom) == telecom) {
                result = "TelecomParisTech";
            } else {
                result = "Eurecom";
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}