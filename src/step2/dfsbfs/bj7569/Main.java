package step2.dfsbfs.bj7569;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class tomato{
    int x; //세로
    int y; //가로
    int z; //면

    tomato(int z, int x, int y){
        this.z = z; //면
        this.x = x; //세로
        this.y = y; //가로
    }
}

public class Main {
    static int M; // 가로
    static int N; // 세로
    static int H; // 높이

    static int[] dx = { -1, 0, 1, 0, 0, 0 }; //상하좌우위아래
    static int[] dy = { 0, 1, 0, -1, 0, 0 }; //상하좌우위아래
    static int[] dz = { 0, 0, 0, 0, 1, -1 }; //상하좌우위아래

    static int[][][] board; // 토마토 판

    static Queue<tomato> que;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt(); // 가로
        N = sc.nextInt(); // 세로
        H = sc.nextInt(); // 높이

        board = new int[H][N][M]; //토마토판

        que = new LinkedList<tomato>();

        // 토마토판 입력
        for(int i=0;i<H;i++) {
            for(int j=0;j<N;j++) {
                for(int k=0;k<M;k++) {
                    board[i][j][k] = sc.nextInt();
                    //만약 토마토가 익은거라면
                    //큐에 넣어
                    if(board[i][j][k]==1) que.add(new tomato(i,j,k));
                }
            }
        }
        System.out.println(BFS());
    }

    public static int BFS() {
        while(!que.isEmpty()) {
            tomato t = que.remove();

            int z = t.z; //면
            int x = t.x; //세로
            int y = t.y; //가로


            for(int i=0;i<6;i++) {
                int nx = x + dx[i]; //세로
                int ny = y + dy[i]; //가로
                int nz = z + dz[i]; //면

                //범위 안에서
                if(nx>=0 && ny>=0 && nz>=0 && nx<N && ny<M && nz<H) {
                    //토마토가 안익었으면
                    if(board[nz][nx][ny]==0) {
                        //익은 토마토 추가
                        que.add(new tomato(nz, nx, ny));

                        //익은 날자를 얻기위해 그 전 값에서 1 증가
                        board[nz][nx][ny] = board[z][x][y] + 1;
                    }
                }
            }
        }

        //최대 날짜
        int result = Integer.MIN_VALUE;


        for(int i=0;i<H;i++) {
            for(int j=0;j<N;j++) {
                for(int k=0;k<M;k++) {
                    //토마토가 안익은게 있으면
                    if(board[i][j][k]==0) return -1;

                    //날짜 최댓값 구하기
                    result = Math.max(result, board[i][j][k]);
                }
            }
        }

        //토마토가 모두 익은 상태인 경우
        if(result==1) return 0;

            //걸린 일수는 최대 날짜에서 1을 빼줘야 함
        else return result-1;
    }
}