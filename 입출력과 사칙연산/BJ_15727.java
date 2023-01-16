import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_15727 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int home = Integer.parseInt(input.readLine());
        int distance = home / 5;
        if (home % 5 != 0) {
            distance++;
        }
        System.out.println(distance);

    }
}