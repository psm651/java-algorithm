package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

    static Integer[][] matrix; //문제 초기화
    static Integer[][] matrixResult; //중복위치 표기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        matrix = new Integer[N][N];
        for (int i = 0; i < N; i++) {
            String[] list = br.readLine().split(" ");
            for (int j = 0; i < list.length; j++) {
               matrix[i][j]  = Integer.parseInt(list[j]);
            }
        }


    }
}


/*
5

1 19 20 8 25
21 4 3 17 24
12 5 6 16 15
11 18 10 9 23
7 13 14 22 2

 */