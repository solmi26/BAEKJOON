import java.io.*;

public class BJ_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            String n = input.readLine();
            arr[i] = Integer.parseInt(n) % 42;
        }

        for (int i = 0; i < 10; i++) {
            int temp = 0;
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    temp++;
                }
            }
            if (temp == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}