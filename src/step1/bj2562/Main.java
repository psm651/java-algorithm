package step1.bj2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int N = 9;
        int resultKey = 0;
        int resultVal = 0;
        for (int i = 1; i <= N; i++) {
            int compareVal = Integer.parseInt(br.readLine());
            if (resultVal < compareVal) {
                resultVal = compareVal;
                resultKey = i;
            }
        }
        System.out.println(resultVal);
        System.out.println(resultKey);
    }
}
