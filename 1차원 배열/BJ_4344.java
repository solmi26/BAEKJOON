import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(input.readLine());
        int sum = 0;
        int aver = 0;

        for (int i = 0; i < count; i++) {
            sum = 0;
            aver = 0;
            String[] line = input.readLine().split(" ");
            int total = Integer.parseInt(line[0]);
            int[] scores = new int[total];
            for (int j = 0; j < total; j++) {
                scores[j] = Integer.parseInt(line[j + 1]);
                sum += scores[j];
            }
            aver = sum / total;
            int val = 0;
            for (int k : scores) {
                if (aver < k) {
                    val++;
                }
            }
            double result = (double) val / total * 100;
            sb.append(String.format("%.3f", result)).append("%").append("\n");

        }
        System.out.println(sb);

    }
}
