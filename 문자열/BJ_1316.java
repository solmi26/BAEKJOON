import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int count = Integer.parseInt(input.readLine());
        for (int i = 0; i < count; i++) {
            boolean[] abc = new boolean[26];
            int word_count = 0;
            String str = input.readLine();
            for (int j = 0; j < str.length(); j++) {
                int n = str.charAt(j) - 97;
                if (abc[n] == false) {
                    abc[n] = true;
                    word_count++;
                } else {
                    if (n == str.charAt(j - 1) - 97) {
                        word_count++;
                    } else {
                        break;
                    }
                }

            }
            if (word_count == str.length()) {
                result++;
            }

        }
        System.out.println(result);

    }
}

// Arrays.fill(check, Boolean.FALSE);