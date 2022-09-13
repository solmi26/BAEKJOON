import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.charAt(i) > 64 && str.charAt(i) < 91) {
                sb.append((char) (ch + 32));
            } else if (str.charAt(i) > 96 && str.charAt(i) < 123) {
                sb.append((char) (ch - 32));
            }

            // String a = Character.toString(str.charAt(i));
            // if(str.charAt(i)>=97) {
            // sb.append(a.toUpperCase());
            // } else {
            // sb.append(a.toLowerCase());
            // }
        }

        System.out.println(sb);
    }

}
