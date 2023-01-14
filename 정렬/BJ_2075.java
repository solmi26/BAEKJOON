import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ_2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(input.readLine());
        int size = Integer.parseInt(token.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String[] line = input.readLine().split(" ");
            for (int j = 0; j < size; j++) {
                int element = Integer.parseInt(line[j]);
                list.add(element);
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.get(size - 1));

    }
}
