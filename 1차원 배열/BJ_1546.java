import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(input.readLine());
        StringTokenizer token = new StringTokenizer(input.readLine(), " ");
        Double[] scores = new Double[total];
        double max = 0.0;
        double sum = 0.0;

        for (int i = 0; i < total; i++) {
            scores[i] = Double.parseDouble(token.nextToken());
            if (max < scores[i]) {
                max = scores[i];
            }
        }
        for (int i = 0; i < total; i++) {
            scores[i] = (scores[i] / max) * 100;
            sum += scores[i];
        }
        System.out.println(sum / total);

    }
}