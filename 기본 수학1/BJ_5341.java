import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_5341 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int floor;

        do {
            int sum = 0;
            floor = Integer.parseInt(input.readLine());
            if (floor == 0) {
                break;
            }
            for (int i = floor; i > 0; i--) {
                sum += i;
            }
            sb.append(sum + "\n");

        } while (floor > 0);
        System.out.println(sb);

    }

}
