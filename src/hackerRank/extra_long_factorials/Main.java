package hackerRank.extra_long_factorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        BigInteger bigInteger1 = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            BigInteger bigInteger2 = new BigInteger(String.valueOf(i));
            bigInteger1 = bigInteger1.multiply(bigInteger2);
        }
        System.out.println(bigInteger1);
    }
}