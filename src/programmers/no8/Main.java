package programmers.no8;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int m = 6;
    static int n = 4;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
    static int[][] visited = new int[picture.length][picture[0].length];
    public static void main(String[] args) {
        int numberOfArea = 0;//몇개의 영역인지
        int maxSizeOfOneArea = 0;//가장 큰 영역 크기


        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[0].length; j++) {
                if (visited[i][j] == 0 && picture[i][j] != 0) {
                    int count = bfs(i, j);
                    if (maxSizeOfOneArea < count) {
                        maxSizeOfOneArea = count;
                    }
                    numberOfArea++;
                }
            }
        }
        System.out.println(numberOfArea);
        System.out.println(maxSizeOfOneArea);
    }
    //queue
    private static int bfs(int i,int j) {
        int count = 1;
        visited[i][j] = 1;
        Queue<int[]> queue = new LinkedList<>();
        int tmp = picture[i][j];
        queue.add(new int[]{i, j});
        while (!queue.isEmpty()) {
            int[] tmpQueue = queue.poll();
            for (int k = 0; k < 4; k++) {
                int nx = tmpQueue[0] + dx[k];
                int ny = tmpQueue[1] + dy[k];
                if (nx >= 0 && ny >= 0 && nx < picture.length && ny < picture[0].length) {
                    if (visited[nx][ny] != 1 && picture[nx][ny] == tmp) {
                        visited[nx][ny] = 1;
                        count++;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
        return count;
    }

    //stack
//    private static int dfs(int i,int j) {
//        visited[i][j] = 1;
//        int count = 0;
//        int tmp = picture[i][j];
//        for (int k = 0; k < 4; k++) {
//            int nx = i + dx[k];
//            int ny = j + dy[k];
//            if (nx >= 0 && ny >= 0 && nx < picture.length && ny < picture[0].length) {
//                if (visited[nx][ny] != 1 && picture[nx][ny] == tmp) {
//                    count++;
//                    dfs(nx, ny);
//                }
//            }
//        }
//
//        return count;
//    }

}
