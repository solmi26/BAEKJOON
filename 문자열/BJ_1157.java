import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1157 {
    public static void main(String[] args) throws IOException {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] arr = new int[abc.length()];
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine().toUpperCase();
        for (int i = 0; i < abc.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == abc.charAt(i)) {
                    arr[i]++;
                }
            }
        }
        int max = -1;
        char ch = '?';
        for (int k = 0; k < arr.length; k++) {
            if (max <= arr[k]) {
                if (max == arr[k]) {
                    ch = '?';
                } else {
                    max = arr[k];
                    ch = abc.charAt(k);
                }

            }

        }
        System.out.println(ch);

    }
}
