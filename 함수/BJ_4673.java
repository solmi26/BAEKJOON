public class BJ_4673 {
    static void d() {
        boolean[] arr = new boolean[10000 + 1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 10000; i++) {
            int n = 0;

            if (i >= 1000) {
                n = i + (i / 1000) + ((i % 1000) / 100) + ((i % 100) % 10) + ((i % 100) /
                        10);
            } else if (i >= 100) {
                n = i + (i / 100) + ((i % 100) / 10) + ((i % 100) % 10);
            } else {
                n = i + (i / 10) + (i % 10);
            }
            if (n > 10000) {
                continue;
            }
            arr[n] = true;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == false) {
                sb.append(j).append("\n");
            }
        }
        System.out.println(sb);

    }

    public static void main(String[] args) {
        d();
    }
}
