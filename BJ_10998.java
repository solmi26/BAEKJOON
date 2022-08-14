import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10998 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        StringTokenizer token = new StringTokenizer(str, " ");

        System.out.println(Integer.parseInt(token.nextToken()) * Integer.parseInt(token.nextToken()));

    }

}
