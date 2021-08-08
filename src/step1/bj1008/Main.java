package step1.bj1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] line = br.readLine().split(" ");
        Double a = Double.valueOf(line[0]);
        Double b = Double.valueOf(line[1]);
        System.out.println(a/b);
    }
}
