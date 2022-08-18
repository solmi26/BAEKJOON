import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int[] dices = { Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]) };
        int money = 0;

        for (int i = 0; i < dices.length - 1; i++) {
            for (int j = dices.length - 1; j > i; j--) {
                if (dices[j - 1] > dices[j]) {
                    int temp = dices[j - 1];
                    dices[j - 1] = dices[j];
                    dices[j] = temp;
                }
            }
        }

        if (dices[0] == dices[1] && dices[0] == dices[2]) {
            money = 10000 + (dices[1] * 1000);
        } else if (dices[0] == dices[1] || dices[1] == dices[2]) {
            money = 1000 + (dices[1] * 100);
        } else {
            money = dices[2] * 100;
        }
        System.out.println(money);
    }
}
