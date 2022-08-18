import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");

        int hour = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[1]);

        if (min < 45) {
            hour--;
            min = 60 - (45 - min);
            if (hour == -1) {
                hour = 23;
            }

        } else {
            min -= 45;
        }

        System.out.println(hour + " " + min);
    }
}
