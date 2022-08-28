import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2941 {
    public static void main(String[] args) throws IOException {
        String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        int count = 0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        for (int i = 0; i < arr.length; i++) {
            while (str.contains(arr[i])) {
                str = str.replaceFirst(arr[i], " ");
                count++;
            }

        }

        str = str.replace(" ", "");
        count += str.length();
        System.out.println(count);
    }
}

// for(int i = 0; i < arr.length ; i++){
// if(str.contains(arr[i])){
// str = str.replace(arr[i],"0"); //한글자로 바꾸기
// }
// }

// System.out.println(str.length());