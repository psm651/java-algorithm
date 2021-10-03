package step2.queue.bj11866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        sb.append("<");
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 0; i < K; i++) {
                int tmp = queue.poll();
                if (i == K - 1) {
                    sb.append(tmp).append(", ");
                    break;
                }
                queue.offer(tmp);
            }
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");
        System.out.println(sb);
    }
}
