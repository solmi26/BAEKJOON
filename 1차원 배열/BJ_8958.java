import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(input.readLine());
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int temp = 1;
            sum = 0;
            String str = input.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O' || str.charAt(j) == 'o') {
                    sum += temp;
                    temp++;
                    if (j + 1 == str.length()) {
                        break;
                    }
                    if (str.charAt(j + 1) == 'X' || str.charAt(j + 1) == 'x') {
                        temp = 1;
                    }

                }

            }
            // for (int j = 0; j < str.length(); j++) {
            // if (str.charAt(j) == 'O') {
            // sum += temp;
            // temp++;
            // }else{
            // temp=1;
            // }}
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }

}
