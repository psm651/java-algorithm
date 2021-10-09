package step2.dfsbfs.bj2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
    static int N;
    static int[][] map;
    static int count;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    static boolean[][] visited;
    static ArrayList<Integer> groupCount = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            for (int j = 0; j < N; j++) {
                int tmp = Character.getNumericValue(row.charAt(j));
                map[i][j] = tmp;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    count = 1;
                    bfs(i,j);
                    groupCount.add(count);
                }
            }
        }
        Collections.sort(groupCount);
        System.out.println(groupCount.size());
        for (Integer count : groupCount) {
            System.out.println(count);
        }
    }
    static void bfs(int i, int j){
        Queue<int[]> que = new LinkedList<>();
        visited[i][j] = true;
        que.add(new int[]{i, j});
        while (!que.isEmpty()) {
            int[] tmp = que.poll();
            int x = tmp[0];
            int y = tmp[1];
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        count++;
                        que.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
