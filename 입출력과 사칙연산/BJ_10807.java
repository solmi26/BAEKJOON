import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        input.readLine();
        String[] str = input.readLine().split(" ");
        int count = 0;
        int v = Integer.parseInt(input.readLine());
        for (int i = 0; i < str.length; i++) {
            if (Integer.parseInt(str[i]) == v) {
                count++;
            }
        }
        System.out.println(count);

    }

}
