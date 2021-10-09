package step2.dfsbfs.bj1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int worm;//지렁이 갯수
    static int[][] map;//배추밭
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int M;//배추 가로길이
    static int N;//배추 세로길이
    static int K;//배추 갯수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //테스트케이스 개수
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            worm = 0;
            String[] testCase = br.readLine().split(" ");
            M = Integer.parseInt(testCase[0]);//맵의 가로길이
            N = Integer.parseInt(testCase[1]);//맵의 세로길이
            K = Integer.parseInt(testCase[2]);//배추갯수
            map = new int[M][N];//배추밭 크기
            visited = new boolean[M][N];
            for (int j = 0; j < K; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;//배추위치
            }
            /////배추밭 구성완료/////
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (map[j][k] == 1 && !visited[j][k]) {
                        dfs(j,k);
                        worm += 1;
                    }
                }
            }
            System.out.println(worm);
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
