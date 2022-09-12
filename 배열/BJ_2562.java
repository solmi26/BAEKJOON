import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            String n = input.readLine();
            array[i] = Integer.parseInt(n);
        }

        int max = array[0];
        int count = 0;
        int index = 0;
        for (int i : array) {
            count++;
            if (max <= i) {
                max = i;
                index = count;
            }

        }
        System.out.print(max + "\n" + index);

    }
}