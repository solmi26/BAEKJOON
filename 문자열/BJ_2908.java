import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str = input.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        int new_a = ((a % 10) * 100) + (((a % 100) / 10) * 10) + (a / 100);
        int new_b = ((b % 10) * 100) + (((b % 100) / 10) * 10) + (b / 100);

        System.out.println(Math.max(new_a, new_b));
    }
}

// import java.io.IOException;
// public class Main {
// public static void main(String[] args) throws IOException {

// int a = 0;
// int b = 0;

// a += System.in.read() - 48;
// a += (System.in.read() - 48)*10;
// a += (System.in.read() - 48)*100;

// System.in.read();

// b += System.in.read() - 48;
// b += (System.in.read() - 48)*10;
// b += (System.in.read() - 48)*100;

// System.out.println(a > b ? a:b);
// }
// }

// int num1 = Integer.parseInt(new
// StringBuilder(st.nextToken()).reverse().toString());
// int num2 = Integer.parseInt(new
// StringBuilder(st.nextToken()).reverse().toString());