import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BJ_5997_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 28; i++)
            set.add(Integer.parseInt(input.readLine()));

        for (int i = 1; i <= 30; i++)
            if (set.contains(i) == false)
                System.out.println(i);

    }

}
