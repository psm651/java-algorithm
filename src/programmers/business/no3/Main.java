package programmers.business.no3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        String[] card = {"ABACDEFG", "NOPQRSTU", "HIJKLKMM"};
        String[] card = {"AABBCCDD", "KKKKJJJJ", "MOMOMOMO"};
//        String[] word = {"GPQM", "GPMZ", "EFU", "MMNA"};
        String[] word = {"AAAKKKKKMMMMM", "ABCDKJ"};

        solution(card, word);

    }

    private static boolean containsZero(int[] array) {
        for (int value : array) {
            if (value == 0) {
                return false; // 0이 하나라도 있으면 false 반환
            }
        }
        return true; // 0이 없으면 true 반환
    }

    public static String[] solution(String[] card, String[] word) {
//       길이가3인 1차원 배열
//        card에 visited가 전부 1이면 성공
//        word를 반복문 돌면서 card 한줄씩 있는지 검증 있으면 visited 1증가
        int[] visited = {0, 0, 0};
        List<String> list = new ArrayList<>();
        String[] answer = {};
        for (String string : word) {
//            word에 알파벨 별
            boolean wordBreak = false;
            for (int i = 0; i < string.length(); i++) {
                boolean flag = false;
                for (int j = 0; j < card.length; j++) {
                    if (card[j].contains(String.valueOf(string.charAt(i)))) {
                        flag = true;
                        // word 제거한 갯수가 card제거한 갯수보다 적은지
                        String s = string.replaceAll(String.valueOf(string.charAt(i)), "");
                        String b = card[j].replaceAll(String.valueOf(string.charAt(i)), "");
                        if ((string.length() - s.length()) > (card[j].length() - b.length())) {
                            wordBreak = true;
                            break;
                        }
                        visited[j] = 1;
                        break;
                    }
                }
                if (wordBreak) {
                    break;
                }
                if (!flag) {
                    visited = new int[]{0, 0, 0};
                }
            }
            if (containsZero(visited)) {
                list.add(string);
            }
            visited = new int[]{0, 0, 0};
        }
        if (list.size() == 0) {
            list.add("-1");
        }
        return list.toArray(new String[0]);
    }

}
