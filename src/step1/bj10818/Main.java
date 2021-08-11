package step1.bj10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int N = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int max = -1000000;
        int min = 1000000;
        for (int i=0; i<N; i++) {
            int compareVal = Integer.parseInt(line[i]);
            if (max < compareVal) {
                max = compareVal;
            }
            if (min > compareVal) {
                min = compareVal;
            }
        }
        System.out.print(min + " " + max);
    }
}
