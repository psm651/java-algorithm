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
        oilPrice = new long[N + 1];
        distanceList = new long[N];
        StringTokenizer distanceToken = new StringTokenizer(br.readLine(), " ");
        StringTokenizer oilToken = new StringTokenizer(br.readLine(), " ");
        //배열선언 안하고도 가능할듯?
        for (int i = 0; i < N; i++) {
            oilPrice[i] = Long.valueOf(oilToken.nextToken());
        }
        for (int i = 0; i <N-1 ; i++) {
            distanceList[i] = Long.valueOf(distanceToken.nextToken());
        }
        int location = 0;
        int nextLocation = 1;
        int result = 0;
        while (location<N-1) {
            if (nextLocation == N - 1) {
                for (int i = location; i < nextLocation - location; i++) {
                    result += (oilPrice[location] * distanceList[i]);
                }
            }
            if (oilPrice[location] <= oilPrice[nextLocation]) {
            } else {
                for (int i = location; i < nextLocation - location; i++) {
                    result += (oilPrice[location] * distanceList[i]);
                }
                location = nextLocation;
            }
            nextLocation++;
        }
        System.out.println(result);
    }
}
