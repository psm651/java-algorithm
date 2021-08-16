package step1.bj1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int max = 0;
        float result = 0;
        String[] score = br.readLine().split(" ");
        for (String s : score) {
            if (max < Integer.parseInt(s)) {
                max = Integer.parseInt(s);
            }
        }
        for (String s2 : score) {
            result += (Float.parseFloat(s2)/max)*100;
        }
        System.out.println(result / count);

    }
}
