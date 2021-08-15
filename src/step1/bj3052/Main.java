package step1.bj3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        ArrayList remain = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int A = Integer.parseInt(br.readLine()) % 42;
            if (! remain.contains(A)) {
                remain.add(A);
            }
        }
        System.out.println(remain.size());
    }
}
