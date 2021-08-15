package step1.bj2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String result = Integer.toString(A*B*C);
        for (int i = 0; i < 10; i++) {

            System.out.println( countChar(result, Character.forDigit(i,10)));
//            System.out.println( countChar(result, (char) i));
//            int count = 0;
//            for (int j = 0; j < result.toString().length(); j++) {
//                if (Integer.toString(i).equals(String.valueOf(result.charAt(j)))){
//                    count ++;
//                }
//            }
//            System.out.println(count);
        }
    }

    public static long countChar(String result, char ch) {
        return result.chars().filter(c -> c == ch).count();
    }
}
