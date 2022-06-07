package programmers.no7;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static boolean[][] visited;
    public static void main(String[] args) {

//        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}};
        visited = new boolean[maps.length][maps[0].length];

        bfs(0, 0, maps);
        if (maps[maps.length-1][maps[0].length-1] == 1) {
            System.out.println(-1);
        }else {
            System.out.println(maps[maps.length-1][maps[0].length-1]);
        }
        //n과m이 1일수도 있음
        //bfs사용
    }

    static int bfs(int i, int j, int[][] maps) {
        int count = 0;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        Queue<int[]> queue = new LinkedList<>();
        visited[i][j] = true;
        queue.add(new int[]{i, j});
        while (!queue.isEmpty()) {
            int[] position = queue.poll();
            for (int k = 0; k < 4; k++) {
                int nx = position[0] + dx[k];
                int ny = position[1] + dy[k];
                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length) {//범위 안쪽
                    if (!visited[nx][ny] && maps[nx][ny] == 1) {//방문안했고, 1로 길이 열려있을때
                        maps[nx][ny] = maps[position[0]][position[1]] + 1;//이상함 안바꿔줄때 넣어야할지도
                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return count;
    }
}
