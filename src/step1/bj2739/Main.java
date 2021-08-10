package step1.bj2739;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] line = br.readLine().split("");
        int a = Integer.parseInt(line[0]);
        for (int i = 1; i < 10; i++) {
            System.out.println(a + " * " + i + " = " + a*i);
        }
    }
}
