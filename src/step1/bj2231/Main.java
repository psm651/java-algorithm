package step1.bj2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int result = 0;
        for (int i = 0; i < N; i++) {
            if (N == i + getDividedPlus(i)) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

    static int getDividedPlus(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n = n / 10;
        }
        return sum;
    }
}
