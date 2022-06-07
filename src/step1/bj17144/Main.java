package step1.bj17144;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        int R = Integer.parseInt(tmp[0]);//행
        int C = Integer.parseInt(tmp[1]);//열
        int T = Integer.parseInt(tmp[2]);//시간
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        int[] upSite = null;
        int[][] map = new int[R][C];
        for (int i = 0; i < R; i++) {
//            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            String[] tmpMap = br.readLine().split(" ");
            for (int j = 0; j <C ; j++) {
                int val = Integer.parseInt(tmpMap[j]);
                if (val == -1 && upSite == null) {
                    upSite = new int[]{i, j};
                }
                map[i][j] = val;
            }
        }
        ////////세팅완료////////////
        //확산 및 정화
        for (int i = 0; i < T; i++) {
            //확산
            for (int j = 0; j < R; j++) {
                for (int k = 0; k < C; k++) {
                    if (map[j][k] != 0) {
                        int count = 0;
                        for (int l = 0; l < 4; l++) {
                            int nx = j + dx[l];
                            int ny = k + dy[l];
                            if (nx >= 0 && nx < i && ny >= 0 && ny < k && map[nx][ny] != -1) {
                                count++;
                                //구현중
//                                map[][]
                            }
                        }
                    }
                }
            }
        }

        System.out.println(upSite[0]);
        System.out.println(Arrays.toString(map[1]));

    }

}
