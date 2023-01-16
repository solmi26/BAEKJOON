import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ_2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(input.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            Integer[] array = new Integer[10];
            StringTokenizer token = new StringTokenizer(input.readLine());
            for (int j = 0; j < 10; j++) {
                array[j] = Integer.parseInt(token.nextToken());
            }
            Arrays.sort(array, Collections.reverseOrder());
            sb.append(array[2]).append("\n");
        }
        System.out.println(sb);

    }
}