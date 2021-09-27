package step1.bj2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int result = 0;
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        String[] line2 = br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(line2[i]);
        }
        //정렬하면 더 느린거같음.
        Arrays.sort(arr);
        out.println(search(arr, N, M));
    }
    static int search(int[] arr, int N, int M) {
        int result = 0;
        for (int i = 0; i < N - 2; i++) {
            if (arr[i] > M) {
                return result;
            }
            for (int j = i + 1; j < N - 1; j++) {
                if (arr[i] + arr[j] > M) {
                    return result;
                }
                for (int k = j + 1; k < N; k++) {
                    int tmp = arr[i] + arr[j] + arr[k];
                    if (tmp == M) {
                        return tmp;
                    }
                    if (tmp > M) {
                        break;
                    }
                    if (tmp > result) {
                        result = tmp;
                    }
                }
            }
        }
        return result;
    }
}
