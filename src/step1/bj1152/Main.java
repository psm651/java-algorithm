package step1.bj1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] score = br.readLine().split(" ");
        int count = 0;
        for (String s : score) {
            if (s.length() != 0) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
