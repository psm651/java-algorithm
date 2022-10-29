package programmers.lv2;


public class MakeJadenCase {
    public static void main(String[] args) {
        StringBuilder answer = new StringBuilder();
        String s = "3people unFollowed me";
        String[] sArr = s.split(" ");
        for (int i = 0; i < sArr.length; i++) {
            if (Character.isDigit(sArr[i].charAt(0))) {
                continue;
            }
            sArr[i] = Character.toUpperCase(sArr[i].charAt(0)) + sArr[i].substring(1).toLowerCase();
        }
        answer.append(sArr[0]);
        for (int l = 1; l <sArr.length ; l++) {
            answer.append(" ").append(sArr[l]);
        }
        System.out.println(answer);
    }
}
