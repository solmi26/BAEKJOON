import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[31];
        int min = 31;
        int max = 0;
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(input.readLine());
            arr[n] = n;
        }

        for (int i = 1; i < 31; i++) {
            if (arr[i] == 0) {
                if (min > i) {
                    min = i;
                } else {
                    max = i;
                }
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}