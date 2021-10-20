package step1.bj13305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long[] oilPrice;
    static long[] distanceList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        oilPrice = new long[N];
        distanceList = new long[N-1];
        StringTokenizer distanceToken = new StringTokenizer(br.readLine(), " ");
        for (int j = 0; j < N-1; j++) {
            distanceList[j] = Long.valueOf(distanceToken.nextToken());
        }
        StringTokenizer oilPriceToken = new StringTokenizer(br.readLine(), " ");
        for (int j = 0; j < N; j++) {
            oilPrice[j] = Long.valueOf(oilPriceToken.nextToken());
        }
        int start = 0;
        long result=0;
        for (int j = 1; j < N; j++) {
            result += oilPrice[start] * distanceList[j - 1];
            if (oilPrice[start] > oilPrice[j]) {
                start = j;
            }
        }
        System.out.println(result);
    }
}
