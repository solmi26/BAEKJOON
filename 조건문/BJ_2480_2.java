import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2480_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] line = input.readLine().split(" ");
        int dice1 = Integer.parseInt(line[0]);
        int dice2 = Integer.parseInt(line[1]);
        int dice3 = Integer.parseInt(line[2]);
        int same = dice1;
        int money = 0;

        if (dice1 == dice2 && dice1 == dice3 && dice2 == dice3) {
            money = 10000 + (dice1 * 1000);
        } else if (dice1 != dice2 && dice1 != dice3 && dice2 != dice3) {
            money = (Math.max((Math.max(dice1, dice2)), dice3)) * 100;
        } else {
            if (dice1 != dice2) {
                same = dice3;
            }
            money = 1000 + (same * 100);
        }
        System.out.println(money);

    }

}