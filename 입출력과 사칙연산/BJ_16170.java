import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BJ_16170 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM");
        int day = now.getDayOfMonth();
        sb.append(year).append("\n").append(now.format(formatter)).append("\n").append(day);
        System.out.println(sb);

    }
}