import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BJ_1157_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine().toUpperCase();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int val = 1;
            if (map.containsKey(str.charAt(i))) {
                val = map.get(str.charAt(i)) + 1;
            }
            map.put(str.charAt(i), val);
        }
        int max = 0;
        char ch = '?';
        for (Character key : map.keySet()) {

            if (max <= map.get(key)) {
                if (max == map.get(key)) {

                    ch = '?';
                } else {
                    max = map.get(key);
                    ch = key;
                }

            }
        }
        System.out.println(ch);
    }
}

// import java.io.IOException;

// public class Main {
// public static void main(String[] args) throws IOException {

// int[] arr = new int[26]; // 영문자의 개수는 26개임

// int c = System.in.read();

// while (c > 64) { // 공백을 입력받는 순간 종료됨

// if (c < 91) {
// arr[c - 65]++;
// } else {
// arr[c - 97]++;
// }
// c = System.in.read();
// }

// int max = -1;
// int ch = -2; // ? 는 63 이다.

// for (int i = 0; i < 26; i++) {

// if (arr[i] > max) {
// max = arr[i];
// ch = i;
// } else if (arr[i] == max) {
// ch = -2;
// }
// }
// System.out.print((char) (ch+65));
// }

// }