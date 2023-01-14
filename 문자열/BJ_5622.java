import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        int time = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    time += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    time += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    time += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    time += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    time += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    time += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    time += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    time += 10;
                    break;

            }
            // for (int i = 0; i < str.length(); i++) {
            // int ch = str.charAt(i);
            // if (ch > 86) {
            // time += 10;
            // } else if (ch > 83) {
            // time += 9;
            // } else if (ch > 79) {
            // time += 8;
            // } else if (ch > 76) {
            // time += 7;
            // } else if (ch > 73) {
            // time += 6;
            // } else if (ch > 70) {
            // time += 5;
            // } else if (ch > 67) {
            // time += 4;
            // } else {
            // time += 3;
            // }

            // }
        }
        System.out.println(time);

    }
}
