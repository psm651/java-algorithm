package programmers.no2;

import java.util.Locale;

public class Main {
    class Solution {
        public String solution(String new_id) {
            String answer = "";
            //1단계 소문자로
            new_id = new_id.toLowerCase();
            //2단계 특수문자 제거
            new_id = new_id.replaceAll("[^-_.a-z0-9]", "");
            //3단계
            new_id = new_id.replaceAll("[.]{2,}", ".") ;
            //4단계
            new_id = new_id.replaceAll("^[.]|[.]$", "");
            // 5단계
            if (new_id.length() == 0) {
                new_id = "a";
            }
            // 6단계
            if (new_id.length() >= 16) {
                new_id = new_id.substring(0,15);
            }

            // 7단계
            new_id = new_id.replaceAll("\\.$","");

            //8단계
            while (new_id.length() <= 2) {
                new_id = new_id.concat(Character.toString(new_id.charAt(new_id.length() - 1)));
            }
            return new_id;
        }
    }}
