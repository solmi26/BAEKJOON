import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] line = input.readLine().split(" ");

        long sum = 0l;
        for (int i = 0; i < line[0].length(); i++) {
            for (int j = 0; j < line[1].length(); j++) {
                // sum += Character.getNumericValue(line[0].charAt(i)) *
                // Character.getNumericValue(line[1].charAt(j));
                sum += (line[0].charAt(i) - '0') * (line[1].charAt(j) - '0');
            }
        }
        System.out.println(sum);
    }

}