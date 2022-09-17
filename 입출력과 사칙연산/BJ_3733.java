import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_3733 {
    // EOF - 파일 끝 or ctrl+Z 엔터로 종료
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";
        while ((str = input.readLine()) != null) {
            String[] arr = str.split(" ");
            int n = Integer.parseInt(arr[0]);
            int s = Integer.parseInt(arr[1]);
            int result = s / (n + 1);
            sb.append(result).append("\n");
        }
        System.out.println(sb);

    }
}
