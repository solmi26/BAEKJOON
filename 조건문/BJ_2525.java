import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int hour = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[1]);
        int timer = Integer.parseInt(reader.readLine());

        if (min + timer >= 60) {
            min += timer;
            while (min >= 60) {
                hour++;
                min -= 60;
            }
        } else {
            min += timer;
        }
        if (hour >= 24) {
            hour -= 24;
        }

        System.out.println(hour + " " + min);

    }
}