import java.io.IOException;

public class BJ_1001 {
    public static void main(String[] args) throws IOException {

        int a = System.in.read() - 48;
        System.in.read();
        int b = System.in.read() - 48;
        System.out.println(a - b);

    }
}
