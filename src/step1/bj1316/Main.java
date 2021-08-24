package step1.bj1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = 0;
        int N = Integer.parseInt(bf.readLine());
        for (int i = 0; i < N; i++) {
            if (checkGroupWord()) {
                count ++;
            }
        }
        System.out.println(count);
    }

    private static boolean checkGroupWord() throws IOException {
        boolean[] wordList = new boolean[26];
        int beforeVal = 0;
        String str = bf.readLine();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (beforeVal != now) {
                if (!wordList[now - 'a']) {
                    wordList[now - 'a'] = true;
                    beforeVal = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
