import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_14581 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String id = input.readLine();

        System.out.println(":fan::fan::fan:");
        System.out.println(":fan::" + id + "::fan:");
        System.out.println(":fan::fan::fan:");

    }
}
