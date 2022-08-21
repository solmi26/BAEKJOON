import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[Integer.parseInt(input.readLine())];
        String[] element = input.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(element[i]);
        }

        int max = array[0];
        int min = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }

        }
        System.out.println(min + " " + max);

        // for (int i = 0; i < array.length; i++) {
        // for (int j = array.length - 1; j > i; j--) {
        // if (array[j - 1] > array[j]) {
        // int temp = array[j];
        // array[j] = array[j - 1];
        // array[j - 1] = temp;
        // }
        // }

        // }
        // System.out.println(array[0] + " " + array[array.length - 1]);

    }
}