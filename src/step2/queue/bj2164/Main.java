package step2.queue.bj2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            if (queue.isEmpty()) {
                System.out.println(tmp);
                break;
            }
            tmp = queue.poll();
            queue.offer(tmp);
        }
    }
}
