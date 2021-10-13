package hackerRank.queens_attack_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static private int n;
    static private int k;
    static private int[][] board;
    static private int qx;//퀸 x좌표
    static private int qy;//퀸 y좌표
    static private int result;

    //북,동북,동,동남,남,남서,서,서북
    static int[] dx={0,1,1,1,0,-1,-1,-1};
    static int[] dy={1,1,0,-1,-1,-1,0,1};
    public static void main(String[] args) throws IOException {

        ///(수정필요)시간초과, 맵세팅하는게 아닌 키밸류만 비교하여 시간줄여야함.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        board = new int[n+1][n+1];

        StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
        qx = Integer.parseInt(st1.nextToken());
        qy = Integer.parseInt(st1.nextToken());

        for (int i = 0; i < k; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
            int s = Integer.parseInt(st2.nextToken());
            int e = Integer.parseInt(st2.nextToken());
            board[s][e] = -1;
        }
        //init-setting

        //8방향돌기
        //한쪽방향으로 계속이동, 1로 처리하고 마지막에 1 갯수세면 될듯, -1이면 continue
        for (int i = 0; i < dx.length; i++) {
            int nx = qx;
            int ny = qy;
            //퀸의 다음위치
            while (true) {
                nx = nx + dx[i];
                ny = ny + dy[i];
                if (nx > n || ny > n || nx <= 0 || ny <= 0) {
                    break;
                }
                if (board[nx][ny] == -1) {
                    break;
                }
                    result++;
            }
        }
        System.out.println(result);
    }
}