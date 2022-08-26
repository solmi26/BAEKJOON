import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10809 {
    public static void main(String[] args) throws IOException {
        char[] abc = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z' };
        int[] arr = new int[abc.length];
        StringBuilder sb = new StringBuilder();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (abc[i] == str.charAt(j)) {

                    arr[i] = j;
                    break;
                } else {
                    arr[i] = -1;
                }
            }
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);

    }
}

// import java.io.*;
// class Main {
// public static void main(String[] args) throws IOException {
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// String str = br.readLine();
// StringBuilder sb = new StringBuilder();
// for(char c='a'; c<='z'; c++) { 97~122 아스키코드로 넣기도 가능
// sb.append(str.indexOf(c)).append(" ");
// }
// System.out.println(sb);
// }
// }

// for (int i = 97; i <= 122; i++) {
// int index = s.indexOf(i);
// sb.append(index).append(" ");
// }