package hackerRank.sherlock_and_cost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            int[] arr2 = new int[n];
            int result = 0;
            int result2 = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                if (j % 2 == 0) {
                    arr[j] = 1;
                    arr2[j] = tmp;
                } else {
                    arr[j] = tmp;
                    arr2[j] = 1;
                }
            }
            for (int j = 0; j < n-1; j++) {
                result += Math.abs(arr[j] - arr[j+1]);
                result2 += Math.abs(arr2[j] - arr2[j+1]);
            }
            if (result > result2) {
                System.out.println(result);
            } else {
                System.out.println(result2);
            }
        }
    }
}
