import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] line = input.readLine().split(" ");
        long sum = 0l;
        for (int i = 0; i < line.length; i++) {
            sum += Long.parseLong(line[i]);
        }
        System.out.println(sum);
    }
}