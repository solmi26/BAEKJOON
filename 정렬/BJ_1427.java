import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BJ_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] line = input.readLine().split("");
        int size = line.length;
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(line[i]);
        }
        Arrays.sort(array, Collections.reverseOrder());
        for (Integer arr : array) {
            sb.append(arr);
        }
        System.out.println(sb);
    }
}