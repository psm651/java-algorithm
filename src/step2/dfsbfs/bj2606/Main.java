package step2.dfsbfs.bj2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] network;
    static boolean[] infected;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int edge = Integer.parseInt(br.readLine());
        network = new int[N + 1][N + 1];
        infected = new boolean[N + 1];

        //네트워크 연결망
        for (int i = 0; i < edge; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            network[s][e] = 1;
            network[e][s] = 1;
        }
        dfs(1);
        System.out.println(result-1);
    }
    private static void dfs(int node){
        infected[node] = true;
        result += 1;
        for (int i = 1; i < network.length; i++) {
            if (network[node][i] == 1 && !infected[i]) {
                dfs(i);
            }
        }
    }
}
