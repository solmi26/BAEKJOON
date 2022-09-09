import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int kg = Integer.parseInt(input.readLine());
        int n = 0;
        while (kg > 0) {
            if (kg % 5 == 0) {
                kg -= 5;
                n++;
            } else {
                kg -= 3;
                n++;
            }
            if (kg < 0) {
                n = -1;
                break;
            }
        }
        System.out.println(n);
    }

}