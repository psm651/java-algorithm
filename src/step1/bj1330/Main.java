package step1.bj1330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        if(a > b){
            System.out.println(">");
        }else if (a < b){
            System.out.println("<");
        }else {
            System.out.println("==");
        }
    }
}
