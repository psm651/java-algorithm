package programmers.lv2;

import java.util.ArrayList;
import java.util.List;

public class WordRelay {
    public static void main(String[] args) {
        int n = 2;
        int a = 1;//차례
        int b = 1;//턴
//        String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
//        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] words = { "hello", "one", "even", "never", "now", "world", "draw" };
        List<String> list = new ArrayList<>();
        for (int i = 1; i < words.length + 1; i++) {

            //앞단어에 마지막 알파벳과 다르면 탈락
            if (i > 1 && words[i - 2].charAt(words[i - 2].length() - 1) != words[i - 1].charAt(0)) {
                break;
            }
            //이전에 등장한 단어면 탈락
            if (list.contains(words[i - 1])) {
                break;
            }
            list.add(words[i - 1]);

            //모든 사람이 다 돌면 턴 증가
            if (a % n == 0) {
                a = 1;
                b++;
                continue;
            }
            //차례 증가
            a++;
        }
        if (b > words.length / n) {
            a = 0;
            b = 0;
        }
        System.out.println(a + "-" + b);
    }
}
/*
  review 차례와 턴을 증가,초기화 시키는게 아니고 몫과 나머지로 표현하면 더 쉬움.(턴 = 길이/사람수, 차례 길이%사람수)
 */
