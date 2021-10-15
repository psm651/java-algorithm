package hackerRank.find_digits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int result = 0;
            String n = br.readLine();
            for (int j = 0; j < n.length(); j++) {
                int tmp = Character.getNumericValue(n.charAt(j));
                if (tmp != 0 && Integer.parseInt(n) % tmp == 0) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
