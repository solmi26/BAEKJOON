import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = input.readLine();
        StringTokenizer token = new StringTokenizer(str, " ");
        int n = Integer.parseInt(token.nextToken());
        int x = Integer.parseInt(token.nextToken());

        String[] a = input.readLine().split(" ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(a[i]);
            if (x > array[i]) {
                sb.append(array[i]).append(" ");
            }
        }
        System.out.println(sb);
        // for (int j : array) {
        // if (x > j) {
        // System.out.print(j + " ");
        // }
        // }
    }
}
