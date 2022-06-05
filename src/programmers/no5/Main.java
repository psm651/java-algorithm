package programmers.no5;

public class Main {
    public static void main(String[] args) {
        String s = "one4seveneight";
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        System.out.println(Integer.parseInt(s));
    }
}
