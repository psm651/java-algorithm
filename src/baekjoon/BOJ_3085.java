package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3085 {
    public static int check(char[][] map) {
        int N = map.length;
        int result = 1;
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (map[i][j] == map[i][j - 1]) {
                    count++;
                } else {
                    count = 1;
                }
                if (result < count) {
                    result = count;
                }
            }
            count = 1;
            for (int j = 1; j < N; j++) {
                if (map[j][i] == map[j - 1][i]) {
                    count++;
                }else {
                    count = 1;
                }
                if (result < count) {
                    result = count;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int result = 0;
        char[][] map = new char[N][N];
        for (int i = 0; i < N; i++) {
            map[i] = bf.readLine().toCharArray();
        }

        //행
        for (int i = 0; i < N; i++) {
            //열
            for (int j = 0; j < N - 1; j++) {
                char tmp = map[i][j];
                if (j + 1 < N) {
                    map[i][j] = map[i][j + 1];
                    map[i][j + 1] = tmp;
                    int count = check(map);
                    if (count > result) {
                        result = count;
                    }
                    map[i][j + 1] = map[i][j];
                    map[i][j] = tmp;
                }
                if (i + 1 < N) {
                    map[i][j] = map[i + 1][j];
                    map[i + 1][j] = tmp;
                    int count = check(map);
                    if (count > result) {
                        result = count;
                    }
                    map[i + 1][j] = map[i][j];
                    map[i][j] = tmp;
                }
            }
        }
        System.out.println(result);
    }
}
