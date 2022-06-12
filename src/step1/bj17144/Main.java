package step1.bj17144;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        int R = Integer.parseInt(tmp[0]);//행
        int C = Integer.parseInt(tmp[1]);//열
        int T = Integer.parseInt(tmp[2]);//시간
        List<Integer> airCleanerRows = new ArrayList<>();
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        int[][] map = new int[R][C];
        for (int i = 0; i < R; i++) {
//            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            String[] tmpMap = br.readLine().split(" ");
            for (int j = 0; j <C ; j++) {
                int val = Integer.parseInt(tmpMap[j]);
                if (val == -1) {
                    airCleanerRows.add(i);
                }
                map[i][j] = val;
            }
        }
        ////////세팅완료////////////
        //확산 및 정화
        for (int i = 0; i < T; i++) {
            //확산
            int[][] temp = new int[R][C];
            for (int j = 0; j < R; j++) {
                for (int k = 0; k < C; k++) {
                    if (map[j][k] == -1) {
                        temp[j][k] = -1;
                        continue;
                    }
                    temp[j][k] += map[j][k];
                    for (int l = 0; l < 4; l++) {
                        int nx = j + dx[l];
                        int ny = k + dy[l];
                        if (nx >= 0 && nx < i && ny >= 0 && ny < k && map[nx][ny] != -1) {
                            temp[j][k] -= (map[j][k] / 5);
                            temp[nx][ny] += (map[j][k] / 5);
                        }
                    }
                }
            }
            map = temp;
            for (int r = 0; r < map.length; r++) {
                System.out.println(Arrays.toString(map[r]));
            }

            //청소
            int top = airCleanerRows.get(0);
            for (int j = top - 1; j > 0; j--) {
                map[j][0] = map[j - 1][0];
            }
            for (int j = 0; j < C - 1; j++) {
                map[0][j] = map[0][j + 1];
            }
            for (int j = 0; j < top; j++) {
                map[j][C - 1] = map[j + 1][C - 1];
            }
            for (int j = C - 1; j > 0; j--) {
                map[top][j] = map[top][j - 1];
            }
            map[top][1] = 0;

            int bottom = airCleanerRows.get(1);
            for (int j = bottom + 1; j < R - 1; j++) {
                map[j][0] = map[j + 1][0];
            }
            for (int j = 0; j < C - 1; j++) {
                map[R - 1][j] = map[R - 1][j + 1];
            }
            for (int j = R - 1; j > bottom; j--) {
                map[j][C-1] = map[j-1][C-1];
            }

            for (int j = C - 1; j > 1; j--) {
                map[bottom][j] = map[bottom][j-1];
            }

            map[bottom][1] = 0;

        }

        System.out.println(airCleanerRows.get(0));
        System.out.println(airCleanerRows.get(1));
        for (int i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }

    }

}
