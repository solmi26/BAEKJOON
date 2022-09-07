import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//손익분기점 구하기
public class BJ_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] token = input.readLine().split(" ");
        int fix = Integer.parseInt(token[0]); // 고정비용
        int var = Integer.parseInt(token[1]); // 변동 비용
        int product = Integer.parseInt(token[2]); // 상품 값
        int n = 0; // 상품개수
        int profit = product - var; // 제품 1개당 판매 이익

        if (var >= product) {// 생산 비용이 판매 비용보다 비싸거나 같다면 당연히 이익X
            n = -1;
        } else {
            n = fix / profit + 1; // ex) 1000, 70, 170이면 c-b=100(한대당 이익) -> a/100=(10) = 10개 판매 시 총 지출 비용 따라잡음 여기에
                                  // +1 해주면 수익구간
        }

        System.out.println(n);
    }
}